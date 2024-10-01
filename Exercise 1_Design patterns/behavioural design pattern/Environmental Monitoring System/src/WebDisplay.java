// WebDisplay.java
public class WebDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Web Display: Temperature updated to " + temperature + "°C");
    }
}
