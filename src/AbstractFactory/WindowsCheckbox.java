package AbstractFactory;

public class WindowsCheckbox implements Checkbox{

    public WindowsCheckbox() {

    }

    @Override
    public void render() {
        System.out.println("Windows Checkbox rendered");
    }
}
