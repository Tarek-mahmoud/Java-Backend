
// When type of the object is determined at run-time, it is known as dynamic binding.

class Animal {
    public void eat() {
        System.out.println("animal is eating");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("dog is eating");
    }
}

public class DynamicBinding {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();  // dynamic binding
        // In the above example object type cannot be determined by the compiler, because the instance of Dog is also an
        // instance of Animal.So compiler doesn't know its type, only its base type
    }
}
