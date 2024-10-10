package AbstractFactory;

public class Main {

    public static void main(String[] args) {
        OSType os = OSType.WINDOWS;
        GUIFactory factory;

        if(os.equals(OSType.WINDOWS)) {
            factory = new WindowsFactory();
        }else {
            factory = new MacFactory();
        }

        Application app = new Application(factory);
        app.renderUI();

    }
}
