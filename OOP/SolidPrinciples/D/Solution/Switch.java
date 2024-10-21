package Section12.SolidPrinciples.D.Solution;

// High-level module depends on abstraction
public class Switch {

    private Switchable device;

    public Switch(Switchable device) {
        this.device = device;
    }

    public void operate() {
        device.turnOn();
    }
}