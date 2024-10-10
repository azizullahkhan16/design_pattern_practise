package Singleton;

import java.util.concurrent.Semaphore;

public class Singleton {

    private static volatile Singleton instance;


    private Singleton() {}


    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }

    @Override
    public String toString() {
        return "Singleton";
    }
}
