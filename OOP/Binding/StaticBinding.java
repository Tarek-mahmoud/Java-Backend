
// If there is any private, final or static method in a class, there is static binding.

public class StaticBinding {
    private void demo() {
        System.out.println("Demo method");
    }

    public static void main(String[] args) {
        StaticBinding test = new StaticBinding();
        test.demo();    // static binding
    }
}
