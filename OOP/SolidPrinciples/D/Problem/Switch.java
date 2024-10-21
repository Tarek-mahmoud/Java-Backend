package Section12.SolidPrinciples.D.Problem;

public class Switch {

    private LightBulb bulb;

    public Switch(LightBulb bulb) {
        this.bulb = bulb;
    }

    public void operate() {
        bulb.turnOn();
    }
}

/*
    The Switch class depends directly on the LightBulb class. If you want to change the light source to something else,
    say an LED or a SmartBulb, you would need to modify the Switch class.

    This violates the DIP because the high-level module (Switch) depends directly on a low-level module (LightBulb), instead of depending on an abstraction.
 */