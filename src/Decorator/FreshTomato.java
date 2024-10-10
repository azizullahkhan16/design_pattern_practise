package Decorator;

public class FreshTomato extends ToppingDecorator{
    private final Pizza pizza;

    public FreshTomato(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Fresh Tomato";
    }

    @Override
    public double getCost() {
        return 10.0 + pizza.getCost();
    }
}
