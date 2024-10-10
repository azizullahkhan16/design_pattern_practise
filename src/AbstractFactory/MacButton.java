package AbstractFactory;

public class MacButton implements Button {

    public MacButton() {

    }

    @Override
    public void render() {
        System.out.println("Mac Button rendered");
    }
}
