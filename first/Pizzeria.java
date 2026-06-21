public class Pizzeria {
    public static void main(String[] args) {
        Pizza margerita = new PizzaThinCrust();
        margerita = new Cheese(margerita);
        margerita = new Tomato(margerita);
        // Printing Margerita info
        String marg_desc = margerita.getDescription();
        float marg_price = margerita.getPrice();
        System.out.println("Margerita Pizza");
        System.out.println("Description");
        System.out.println(marg_desc);
        System.out.println("Price: " + marg_price);

        System.out.println("");

        Pizza portuguese = new PizzaThickCrust();
        portuguese = new Cheese(portuguese);
        portuguese = new Egg(portuguese);
        portuguese = new Tomato(portuguese);
        // Printing Portuguese info
        String port_desc = portuguese.getDescription();
        float port_price = portuguese.getPrice();
        System.out.println("Portuguese Pizza");
        System.out.println("Description");
        System.out.println(port_desc);
        System.out.println("Price: " + port_price);
    }
}