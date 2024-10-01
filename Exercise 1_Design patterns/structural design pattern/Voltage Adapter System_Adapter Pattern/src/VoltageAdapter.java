// VoltageAdapter.java
public class VoltageAdapter implements Voltage110V {
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public void supply110V() {
        System.out.println("Converting 220V to 110V");
        voltage220V.supply220V();
    }
}
