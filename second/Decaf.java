public class Decaf implements Bebida {
    @Override
    public double calculaCusto() {
        return 10.1;
    }
    @Override
    public String getDescricao() {
        return "Bebida: Decaf";
    }
}