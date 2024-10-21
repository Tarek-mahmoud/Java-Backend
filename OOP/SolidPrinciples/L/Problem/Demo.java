package Section12.SolidPrinciples.L.Problem;

public class Demo {
    public static void main(String[] args) {

        Bird bird = new Bird();
        bird.fly();

        Bird bird2 = new Penguin();
        bird2.fly();

        // Here, the Penguin class extends Bird, but it violates the LSP because you can’t use a Penguin object where a Bird is expected.
    }
}