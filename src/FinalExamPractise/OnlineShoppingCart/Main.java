package FinalExamPractise.OnlineShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product book = new Book("Harry Potter", 15);
        book.setWarranty(new OneYearWarranty());

        Product pant = new Clothing("Dress pant", 10);
        pant.setWarranty(new TwoYearWarranty());
        List<Customization> customizations = new ArrayList<Customization>();
        customizations.add(new ColorCustomization());
        customizations.add(new SizeCustomization());
        pant.setCustomizations(customizations);

        Cart cart = new Cart();
        cart.addProduct(book, 1);
        cart.addProduct(pant, 2);

        cart.showCart();

    }
}
