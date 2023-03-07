abstract class Parent {

    Parent() {
        System.out.println("This is Abstract Parent Class Constructor...");
    }
    Parent(int a) {
        System.out.println("This is Abstract Parent Class Constructor with argument overloaded...");
    }

    void sayHello() {
        System.out.println("Hello");
    }

    abstract void greet();     // All abstract Methods Should be implemented in SubClass, otherwise Error occur
    abstract void greet(int a);
}

class Child extends Parent {

    Child() {
        System.out.println("heaven");
    }

    public Child(int i) {
        super(34);

        System.out.println(i);
    }    // This is Concrete class created with abstract class

    @Override
    void greet() {
        System.out.println("Good Morning...");
    }

    @Override
    void greet(int a) {
        System.out.println("Good Afternoon...");
    }
}

abstract class Child2 extends Parent {

    Child2() {
        System.out.println("Constructor of Child2 Class...");
    }

    static void th() {
        System.out.println("How are you ?");
    }
}

public class Abstract_Class {
    public static void main(String[] args) {

        // Parent p = new Parent();      // Error --> 'Parent' is abstract; cannot be instantiated (No Object creation)
        // Child2 c2 = new Child2();    //  Error --> 'Child2' is abstract; cannot be instantiated

        Parent p = new Child(1);    // this can be used

        Child c = new Child(1);
        Child c1 = new Child();    // --> second object for calling non - parameterized constructor of ->abstract also
        c.greet();
        System.out.print("Overloaded greet: ");
        c.greet(89);
        c.sayHello();

        Child2.th();
    }
}