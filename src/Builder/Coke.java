package Builder;

public class Coke extends ColdDrink{

    public Coke() {

    }

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 4.0f;
    }
}
