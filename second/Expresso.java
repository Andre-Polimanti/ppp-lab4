public class Expresso implements Bebida {
    @Override
    public double calculaCusto() {
        return 9.2;
    }
    @Override
    public String getDescricao() {
        return "Bebida: Expresso";
    }
}