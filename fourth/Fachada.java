class Motor {
    public void ligar() { System.out.println("Ligando o motor..."); }
    public void desligar() { System.out.println("Desligando o motor..."); }
}

class CintoDeSeguranca {
    public void travar() { System.out.println("Travando o cinto de segurança..."); }
    public void destravar() { System.out.println("Destravando o cinto de segurança..."); }
}

class Porta {
    public void trancar() { System.out.println("Trancando as portas..."); }
    public void destrancar() { System.out.println("Destrancando as portas..."); }
}

class Farol {
    public void acender() { System.out.println("Acendendo o farol..."); }
    public void apagar() { System.out.println("Apagando o farol..."); }
}

class Radio {
    public void ligar() { System.out.println("Ligando o rádio..."); }
    public void sintonizar(String estacao) { System.out.println("Sintonizando o rádio na estação " + estacao + "..."); }
    public void desligar() { System.out.println("Desligando o rádio..."); }
}

class CarroFachada {
    private Motor motor;
    private CintoDeSeguranca cinto;
    private Porta porta;
    private Farol farol;
    private Radio radio;

    public CarroFachada(Motor motor, CintoDeSeguranca cinto, Porta porta, Farol farol, Radio radio) {
        this.motor = motor;
        this.cinto = cinto;
        this.porta = porta;
        this.farol = farol;
        this.radio = radio;
    }

    public void iniciarCorrida(String estacaoPreferida) {
        motor.ligar();
        porta.trancar();
        cinto.travar();
        farol.acender();
        radio.ligar();
        radio.sintonizar(estacaoPreferida);
        System.out.println(">Dando Partida!<\n");
    }

    public void finalizarCorrida() {
        System.out.print(">Parando...<\n");
        motor.desligar();
        porta.destrancar();
        cinto.destravar();
        farol.apagar();
        radio.desligar();
        System.out.println(">Parado e Desligado!<\n");
    }
}

public class Fachada {
    public static void main(String[] args) {
        Motor motor = new Motor();
        CintoDeSeguranca cinto = new CintoDeSeguranca();
        Porta porta = new Porta();
        Farol farol = new Farol();
        Radio radio = new Radio();

        CarroFachada meuCarro = new CarroFachada(motor, cinto, porta, farol, radio);

        meuCarro.iniciarCorrida("Doutor Pimpolho");
        meuCarro.finalizarCorrida();
    }
}