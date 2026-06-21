public class Tomato extends ToppingDecorator {
    public Tomato(Pizza pizza) {
            super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Topping: Tomato";
    }
    @Override
    public float getPrice() {
        return super.getPrice() + 4.3f;
    }
}