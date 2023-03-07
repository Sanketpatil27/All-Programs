class A {
    void meth1() {
        System.out.println("From Super Class");
    }

    static void Greeting() {
        System.out.println("Good Morning");
    }
}

class B extends A {

    @Override       // for to confirm this is overriding
    void meth1() {

        System.out.println("Hello from Sub Class");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {

        A obj2 = new A();   // Only Subclass overrided Method can access
        obj2.meth1();

        B obj = new B();
        obj.meth1();
        obj.Greeting();  // OR
        A.Greeting();
    }
}
