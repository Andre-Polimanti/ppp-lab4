public class Gelo extends BebidaDecorator {
    public Gelo(Bebida bebida) {
            super(bebida);
    }

    @Override
    public double calculaCusto(){
        return bebida.calculaCusto() + 1.2;
    }
    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", gelado";
    }
}