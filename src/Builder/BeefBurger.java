package Builder;

public class BeefBurger extends Burger{

    public BeefBurger() {

    }

    @Override
    public String name() {
        return "Beef Burger";
    }

    @Override
    public float price() {
        return 50.0f;
    }
}
