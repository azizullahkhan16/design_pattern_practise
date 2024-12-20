package Observer;

public class DesktopDisplay implements Subscriber{
    private String name;

    public DesktopDisplay(String name) {
        this.name = name;
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println(name + " received update: " +
                "Temperature: " + temperature +
                ", Humidity: " + humidity +
                ", Pressure: " + pressure);
    }
}
