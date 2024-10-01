// AdapterPatternDemo.java
public class AdapterPatternDemo {
    public static void main(String[] args) {
        Voltage220V voltage220V = new Voltage220V();
        VoltageAdapter adapter = new VoltageAdapter(voltage220V);

        adapter.supply110V();
    }
}
