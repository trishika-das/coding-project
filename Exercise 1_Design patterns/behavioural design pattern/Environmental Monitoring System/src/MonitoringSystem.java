// MonitoringSystem.java
public class MonitoringSystem {
    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor();
        MobileDisplay mobileDisplay = new MobileDisplay();
        WebDisplay webDisplay = new WebDisplay();

        sensor.registerObserver(mobileDisplay);
        sensor.registerObserver(webDisplay);

        sensor.setTemperature(25.0f);
        sensor.setTemperature(30.5f);
    }
}
