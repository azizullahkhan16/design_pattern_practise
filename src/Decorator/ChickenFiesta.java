package Decorator;

public class ChickenFiesta extends Pizza{
    public ChickenFiesta() {
        super.description = "Chicken Fiesta";
    }
    @Override
    public double getCost() {
        return 400.0;
    }
}
