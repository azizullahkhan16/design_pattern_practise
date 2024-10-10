package AbstractFactory;

public class WindowsButton implements Button {

    public WindowsButton() {
    }

    @Override
    public void render() {
        System.out.println("Windows Button rendered");
    }
}
