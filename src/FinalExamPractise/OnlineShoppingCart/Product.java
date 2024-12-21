package FinalExamPractise.OnlineShoppingCart;

import java.util.ArrayList;
import java.util.List;

public abstract class Product {
    protected String name;
    protected float price;
    protected List<Customization> customizations;
    protected Warranty warranty;


    public Product(String name, float price) {
        this.name = name;
        this.price = price;
        this.customizations = new ArrayList<Customization>();
        this.warranty = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public List<Customization> getCustomizations() {
        return customizations;
    }

    public void setCustomizations(List<Customization> customizations) {
        this.customizations = customizations;
    }

    public Warranty getWarranty() {
        return warranty;
    }

    public void setWarranty(Warranty warranty) {
        this.warranty = warranty;
    }
}
