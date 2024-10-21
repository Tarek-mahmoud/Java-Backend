package Section12.SolidPrinciples.D.Solution;

// Another Low-level module (Implementation)
public class Fan implements Switchable {

    @Override
    public void turnOn() {
        System.out.println("Fan is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is turned off");
    }
}