abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
    }
}
