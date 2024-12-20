package Observer;

public interface Publisher {
    void registerDevice(Subscriber device);
    void removeDevice(Subscriber device);
    void notifySubscribers();

}
