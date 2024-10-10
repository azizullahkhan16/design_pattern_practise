package Decorator;

public class Margheritta extends Pizza{
    public Margheritta() {
        super.description = "Margheritta";
    }
    @Override
    public double getCost() {
        return 300.0;
    }
}
