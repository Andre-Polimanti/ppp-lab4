public class PizzaThinCrust implements Pizza {
    @Override
    public String getDescription() {
        return "Crust: Thin";
    }
    @Override
    public float getPrice() {
        return 13.4f;
    }
}