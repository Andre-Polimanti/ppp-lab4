public class Chocolate extends BebidaDecorator {
    public Chocolate(Bebida bebida) {
            super(bebida);
    }

    @Override
    public double calculaCusto(){
        return bebida.calculaCusto() + 6.7;
    }
    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", com chocolate";
    }
}