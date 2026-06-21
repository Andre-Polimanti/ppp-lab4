public class Leite extends BebidaDecorator {
    public Leite(Bebida bebida) {
            super(bebida);
    }

    @Override
    public double calculaCusto(){
        return bebida.calculaCusto() + 3.1;
    }
    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", com leite";
    }
}