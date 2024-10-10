package Decorator;

public class Barbeque extends ToppingDecorator{
    private final Pizza pizza;


    public Barbeque(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Barbeque";
    }
    @Override
    public double getCost() {
        return 30.0 + pizza.getCost();
    }
}
