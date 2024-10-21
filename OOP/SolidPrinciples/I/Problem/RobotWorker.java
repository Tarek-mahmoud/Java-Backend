package Section12.SolidPrinciples.I.Problem;

public class RobotWorker implements Worker {

    @Override
    public void work() {
        System.out.println("Robot is working.........");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Robot does not eat");
    }
}