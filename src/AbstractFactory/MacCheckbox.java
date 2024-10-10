package AbstractFactory;

public class MacCheckbox implements Checkbox {

    public MacCheckbox() {

    }

    @Override
    public void render() {
        System.out.println("Mac Checkbox rendered");
    }
}
