package AbstractFactory;

public class MacFactory implements GUIFactory{

    public MacFactory() {

    }

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new MacCheckbox();
    }
}
