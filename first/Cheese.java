public class Cheese extends ToppingDecorator {
    public Cheese(Pizza pizza) {
            super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Topping: Cheese";
    }
    @Override
    public float getPrice() {
        return super.getPrice() + 7.1f;
    }
}