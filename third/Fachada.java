class Amplificador {
    public void liga() { System.out.println("Amplificador ligado!"); }
    public void ajustaVolume(int nivel) { System.out.println("Volume do amplificador ajustado para " + nivel + "!"); }
    public void desliga() { System.out.println("Amplificador desligado!"); }
}

class Luzes {
    public void liga() { System.out.println("Luzes ligadas!"); }
    public void desliga() { System.out.println("Luzes desligadas!"); }
}

class MaquinaDePipoca {
    public void liga() { System.out.println("Máquina de pipoca ligada!"); }
    public void arrebentaPipoca() { System.out.println("Rebentando pipoca!"); }
    public void desliga() { System.out.println("Máquina de pipoca desligada!"); }
}

class Projetor {
    public void liga() { System.out.println("Projetor ligado!"); }
    public void desliga() { System.out.println("Projetor desligado!"); }
}

class PlayerStreaming {
    public void liga() { System.out.println("Player de Streaming ligado!"); }
    public void play(String filme) { System.out.println("Player de Streaming dando play no filme '" + filme + "'!"); }
    public void desliga() { System.out.println("Player de Streaming desligado!"); }
}

class Telao {
    public void abaixa() { System.out.println("Abaixando telão!"); }
    public void sobe() { System.out.println("Subindo telão!"); }
}

class SessaoFilme {
    private Amplificador amp;
    private Luzes luzes;
    private MaquinaDePipoca pipoqueira;
    private Projetor projetor;
    private PlayerStreaming player;
    private Telao telao;

    public SessaoFilme(Amplificador amp, Luzes luzes, MaquinaDePipoca pipoqueira,
                             Projetor projetor, PlayerStreaming player, Telao telao) {
        this.amp = amp;
        this.luzes = luzes;
        this.pipoqueira = pipoqueira;
        this.projetor = projetor;
        this.player = player;
        this.telao = telao;
    }

    public void assistirFilme(String filme) {
        pipoqueira.liga();
        pipoqueira.arrebentaPipoca();
        luzes.desliga();
        telao.abaixa();
        projetor.liga();
        amp.liga();
        amp.ajustaVolume(10);
        player.liga();
        player.play(filme);
        System.out.println(">Iniciando Filme!<\n");
    }

    public void fimDoFilme() {
        System.out.print(">Fim do Filme!<\n");
        player.desliga();
        amp.desliga();
        projetor.desliga();
        luzes.liga();
        pipoqueira.desliga();
    }
}

public class Fachada {
    public static void main(String[] args) {
        Amplificador amp = new Amplificador();
        Luzes luzes = new Luzes();
        MaquinaDePipoca pipoqueira = new MaquinaDePipoca();
        Projetor projetor = new Projetor();
        PlayerStreaming player = new PlayerStreaming();
        Telao telao = new Telao();

        SessaoFilme sessao = new SessaoFilme(
            amp, luzes, pipoqueira, projetor, player, telao
        );

        sessao.assistirFilme("O Senhor dos Anéis: A Sociedade do Anel");
        sessao.fimDoFilme();
    }
}