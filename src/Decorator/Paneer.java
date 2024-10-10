package Decorator;

public class Paneer extends ToppingDecorator{
    private final Pizza pizza;

    public Paneer(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Paneer";
    }

    @Override
    public double getCost() {
        return 20.0 + pizza.getCost();
    }
}
