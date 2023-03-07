        // --> runtime polymorphism cannot be achieved by data members

class A1 {
    int x = 23;

    void disp(){
        System.out.println(x);
    }
}

class B1 extends A1 {
    int  x = 34;

    @Override
    void disp(){
        System.out.println(x);
    }
}

public class Dynamic_Method_Dispatch1 {
    public static void main(String[] args) {

        A1 a = new B1();
        System.out.println(a.x);
        a.disp();
    }
}