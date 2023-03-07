class Base1 {

    Base1() {
        System.out.println("I'm constructor");
    }

    Base1(int x) {
        System.out.println("I'm overloaded Base constructor with value of x: " + x);
    }
}

class Derived1 extends Base1 {

    Derived1() {
        super(3);
        System.out.println("I'm constructor of derives class");
    }

    Derived1(int x, int y) {
        super(x);
        System.out.println("I'm derived class constructor with value of y: " + y);
    }
}

class ChildOfDerived extends Derived1 {

    ChildOfDerived() {
        System.out.println("I'm constructor of child class");
    }

    ChildOfDerived(int a, int y, int z) {
        super(456,y);
        System.out.println("I'm overloaded constructor of child class with new value z: " + z);
    }

    static void hii() {
        System.out.println("hello");
    }
}

public class Constructor_In_Inheritance {

    static void hello(){
        System.out.println("Hii");
    }

    public static void main(String[] args) {

        // Base1 b = new Base1();
        // Derived1 d = new Derived1(34,45);
        ChildOfDerived c = new ChildOfDerived(456,233,675);

        ChildOfDerived.hii();       // with making static to method hii it can be accessible by
                                    // only class name and  . operator with method name
        hello();
    }
}