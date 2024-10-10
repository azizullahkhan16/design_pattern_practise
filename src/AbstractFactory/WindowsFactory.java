package AbstractFactory;

public class WindowsFactory implements GUIFactory{

    public WindowsFactory() {

    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new WindowsCheckbox();
    }
}
