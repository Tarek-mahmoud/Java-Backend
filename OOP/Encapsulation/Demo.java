
import Section12.Encapsulation.package1.ClassA;

public class Demo {

    public static void main(String[] args) {

        ClassA classA = new ClassA();
        classA.doSomething();   // public

        //classA.doSomething2() // protected
    }
}
