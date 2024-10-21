package Section12.Encapsulation.package2;

import Section12.Encapsulation.package1.ClassA;

public class ClassB extends ClassA {

    void doSomethingClassB() {
        doSomething2();  // protected : called from child class
        doSomethingClassBPrivate();
    }

    private void doSomethingClassBPrivate() {

    }
}