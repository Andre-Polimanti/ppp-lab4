public class Bacon extends ToppingDecorator {
    public Bacon(Pizza pizza) {
            super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Topping: Bacon";
    }
    @Override
    public float getPrice() {
        return super.getPrice() + 6.7f;
    }
}