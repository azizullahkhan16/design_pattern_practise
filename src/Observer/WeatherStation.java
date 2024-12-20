package Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Publisher{
    private List<Subscriber> devices;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherStation() {
        this.devices = new ArrayList<>();
    }

    @Override
    public void registerDevice(Subscriber device) {
        this.devices.add(device);
    }

    @Override
    public void removeDevice(Subscriber device) {
        this.devices.remove(device);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber device : this.devices) {
            device.update(this.temperature, this.humidity, this.pressure);
        }
    }

    public void setWeatherData(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifySubscribers();
    }
}
