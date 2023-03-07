//import exam.*;   // doesn't work
import exam.Package_Practice;

public class Access_Package_Practice extends Package_Practice {
    public static void main(String[] args) {
        Package_Practice p1 = new Package_Practice();
        p1.sayHi();
        p1.sayHello();
        p1.greet1();
        p1.greet2();
    }
}