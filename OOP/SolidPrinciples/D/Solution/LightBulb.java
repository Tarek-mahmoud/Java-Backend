package Section12.SolidPrinciples.D.Solution;

// Low-level module (Implementation)
public class LightBulb implements Switchable {

    @Override
    public void turnOn() {
        System.out.println("Light Bulb is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Light Bulb is off");
    }
}