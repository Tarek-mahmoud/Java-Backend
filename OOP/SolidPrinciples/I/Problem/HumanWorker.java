package Section12.SolidPrinciples.I.Problem;

public class HumanWorker implements Worker {

    @Override
    public void work() {
        System.out.println("Human is Working.....");
    }

    @Override
    public void eat() {
        System.out.println("Human is eating.....");
    }
}