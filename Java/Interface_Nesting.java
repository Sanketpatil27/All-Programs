interface Outer {

    void disp1();

    interface Inner {
        void disp2();
    }
}

public class Interface_Nesting implements Outer.Inner, Outer {

    public void disp1(){
        System.out.println("Outer Display Method");
    }

    public void disp2() {
        System.out.println("Inner Display Method");
    }

    public static void main(String[] args) {

        Outer o = new Interface_Nesting();
        o.disp1(); // only access outer interface methods

        Interface_Nesting n = new Interface_Nesting();
        n.disp1();     // here disp1() is just normal method not overridden
        n.disp2();
    }
}