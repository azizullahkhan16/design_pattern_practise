package Observer;

public interface Subscriber {
    void update(float temperature, float humidity, float pressure);
}
