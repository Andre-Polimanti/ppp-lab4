public class Canela extends BebidaDecorator {
    public Canela(Bebida bebida) {
            super(bebida);
    }

    @Override
    public double calculaCusto(){
        return bebida.calculaCusto() + 5.2;
    }
    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", com canela";
    }
}