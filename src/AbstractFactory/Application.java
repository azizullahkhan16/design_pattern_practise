package AbstractFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory guiFactory) {
        this.button = guiFactory.createButton();
        this.checkbox = guiFactory.createCheckBox();
    }

    public void renderUI() {
        button.render();
        checkbox.render();
    }

}
