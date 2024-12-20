package Observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        Subscriber phone1 = new PhoneDisplay("Ali's Phone");
        Subscriber phone2 = new PhoneDisplay("Aziz's Phone");
        Subscriber desktop1 = new DesktopDisplay("Bob's Desktop");

        station.registerDevice(phone1);
        station.registerDevice(phone2);
        station.registerDevice(desktop1);

        System.out.println("Weather Update #1:");
        station.setWeatherData(25.0f, 60.0f, 1012.0f);

        System.out.println("\nWeather Update #2:");
        station.setWeatherData(28.0f, 55.0f, 1010.0f);

        System.out.println("\nUnregistering Alice's Phone...");
        station.removeDevice(phone2);

        System.out.println("\nWeather Update #3:");
        station.setWeatherData(30.0f, 50.0f, 1008.0f);
    }
}
