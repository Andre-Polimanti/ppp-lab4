public class Cafeteria {
    public static void main(String[] args) {
        Bebida beb1 = new Decaf();
        beb1 = new Leite(beb1);
        beb1 = new Gelo(beb1);
        beb1 = new Canela(beb1);

        double beb1_custo = beb1.calculaCusto();
        String beb1_desc = beb1.getDescricao();

        System.out.println("Pedido 1");
        System.out.println("Custo: " + beb1_custo);
        System.out.println(beb1_desc);


        Bebida beb2 = new Expresso();
        beb2 = new Chocolate(beb2);
        beb2 = new Leite(beb2);

        double beb2_custo = beb2.calculaCusto();
        String beb2_desc = beb2.getDescricao();

        System.out.println("Pedido 2");
        System.out.println("Custo: " + beb2_custo);
        System.out.println(beb2_desc);
    }
}