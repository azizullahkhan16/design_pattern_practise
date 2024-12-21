package FinalExamPractise.OnlineShoppingCart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> cart;

    public Cart() {
        this.cart = new HashMap<Product, Integer>();
    }

    public void addProduct(Product p, int quantity) {
        this.cart.put(p, quantity);
    }

    public void removeProduct(Product p) {
        this.cart.remove(p);
    }

    public float getTotalPrice() {
        float total = 0;
        for (Map.Entry<Product, Integer> entry : this.cart.entrySet()) {
            total += entry.getKey().getPrice() * entry.getValue();
        }

        return total;
    }

    public void showCart() {
        for (Map.Entry<Product, Integer> entry : this.cart.entrySet()) {
            System.out.println("Product Name: " + entry.getKey().getName());
            System.out.println("Product Price: " + entry.getKey().getPrice());
            System.out.println("Product Quantity: " + entry.getValue());
            if(!entry.getKey().getCustomizations().isEmpty()) {
                for(Customization customization : entry.getKey().getCustomizations()) {
                    System.out.println("Customization name: " + customization.customize());
                }
            }

            if(entry.getKey().getWarranty() != null) {
                System.out.println("Warranty: " + entry.getKey().getWarranty().warranty());
            }

            System.out.println("------------------------------------------");

        }
        System.out.println("Total Price: " + getTotalPrice());
    }
}
