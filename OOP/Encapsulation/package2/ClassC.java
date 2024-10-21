package Section12.Encapsulation.package2;

import Section12.Encapsulation.package1.ClassA;

public class ClassC extends ClassB {

    @Override
    protected void doSomething2() {
        System.out.println("ClassC doSomething2");
    }

    @Override
    public void doSomethingClassB() {

    }
}