// TemperatureSensor.java
import java.util.ArrayList;
import java.util.List;

public class TemperatureSensor implements Sensor {
    private List<Observer> observers;
    private float temperature;

    public TemperatureSensor() {
        observers = new ArrayList<>();
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}
