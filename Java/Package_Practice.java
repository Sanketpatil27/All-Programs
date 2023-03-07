package exam;

interface use1 {
    void greet1() ;
}

interface use2 {
    void greet2() ;
}

public class Package_Practice implements use1, use2 {

    public void greet1() {
        System.out.println("GM");
    }

    public void greet2() {
        System.out.println("GN");
    }

    public static void sayHi() {
        System.out.println("Hii");
    }

    public static void sayHello() {
        System.out.println("Hello");
    }

    public static void main(String[] ar) {

        Package_Practice p = new Package_Practice();
        p.greet1();
        p.greet2();
        sayHi();
        sayHello();
    }
}