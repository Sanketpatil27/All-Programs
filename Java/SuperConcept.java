class Animal {
    String color = "Violate";           // accessed with super.color;

    Animal() {                          // accessed with super();
        System.out.println("Animal is created...");
    }

    void eat() {                // Accessed with super.eat();
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal {
    String color = "Gray";

    Dog() {
        super();
        System.out.println("Dog is created...");
    }

    void printColor() {
        System.out.println("Color = " + color);
        System.out.println("Color of Super Class = " + super.color);
    }

    void eat() {
        System.out.println("Dog is eating...");
    }

    void work() {
        eat();
        super.eat();
    }
}

public class SuperConcept {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.printColor();
        d.work();
    }
}
