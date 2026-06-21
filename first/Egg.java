public class Egg extends ToppingDecorator {
    public Egg(Pizza pizza) {
            super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Topping: Egg";
    }
    @Override
    public float getPrice() {
        return super.getPrice() + 3.5f;
    }
}