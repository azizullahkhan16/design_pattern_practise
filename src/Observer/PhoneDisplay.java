package Observer;

public class PhoneDisplay implements Subscriber{
    private String name;

    public PhoneDisplay(String name) {
        this.name = name;
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println(this.name + " received update: " +
                "Temperature: " + temperature +
                ", Humidity: " + humidity +
                ", Pressure: " + pressure);
    }
}
