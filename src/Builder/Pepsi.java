package Builder;

public class Pepsi extends ColdDrink{
    public Pepsi() {

    }

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 5.0f;
    }
}
