interface SampleInterface1 {
    void meth1();
    void meth2();
}
                // When we want to *inherit *interface in another *interface then we have to use extends keyword
interface ChildSampleInterface2 extends SampleInterface1{
    void meth3();
    void meth4();
}

abstract class SampleClass implements SampleInterface1, ChildSampleInterface2 {
                    // when we don't want to implement methods from interface we make abstract class
    public void meth1() {
        System.out.println("Meth1");
    }
    public void meth2() {
        System.out.println("Meth2");
    }
//    public void meth3() {
//        System.out.println("Meth3");
//    }
//    public void meth4() {
//        System.out.println("Meth4");
//    }
}

class SampleClass2 extends SampleClass {
                                    // in this we have only written methods which are missing in abstract method
    public void meth3() {
        System.out.println("Meth3");
    }
    public void meth4() {
        System.out.println("Meth4");
    }
}

public class Interface_In_Inheritance {
    public static void main(String[] args) {
        SampleClass s = new SampleClass2();
        s.meth1();
        s.meth2();
        s.meth3();
        s.meth4();
    }
}