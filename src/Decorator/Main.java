package Decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new ChickenFiesta();
        System.out.println(pizza.getDescription() + ", Cost: " + pizza.getCost());

        Pizza pizza1 = new ChickenFiesta();
        pizza1 = new FreshTomato(pizza1);
        pizza1 = new FreshTomato(pizza1);
        pizza1 = new Barbeque(pizza1);
        System.out.println(pizza1.getDescription() + ", Cost: " + pizza1.getCost());
    }
}
