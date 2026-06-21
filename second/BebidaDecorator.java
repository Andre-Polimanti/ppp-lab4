public class BebidaDecorator implements Bebida {
    public Bebida bebida;

    public BebidaDecorator(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public double calculaCusto(){
        return bebida.calculaCusto();
    }
    @Override
    public String getDescricao() {
        return bebida.getDescricao();
    }
}