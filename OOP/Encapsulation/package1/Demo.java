package Section12.Encapsulation.package1;

public class Demo {

    public static void main(String[] args) {

        ClassA a = new ClassA();
        a.doSomething();    // public
        a.doSomething2();   // protected => package, child class


    }
}