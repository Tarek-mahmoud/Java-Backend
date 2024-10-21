package Section12.Encapsulation.package2;

public class Demo {

    public static void main(String[] args) {
        ClassB classB = new ClassB();
        classB.doSomethingClassB(); // default => can access in the same package

//        classB.doSomethingClassBPrivate() {};
    }
}