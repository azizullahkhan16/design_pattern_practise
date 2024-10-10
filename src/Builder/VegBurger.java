package Builder;

public class VegBurger extends Burger{
    public VegBurger() {

    }

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
