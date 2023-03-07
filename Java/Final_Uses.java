class demo {
    static final int a = 12;

    static final void add() {
        System.out.println(a+a);
    }
}

public class Final_Uses extends demo {      // cannot inherit final class

//    void add() {                      // cannot override final method
//        System.out.println("hii");
//    }


    public static void main(String[] args) {
//        demo.a = 12;   // cannot modify value of final variable
        demo.add();
//        super.add();   // cannot use super keyword directly
    }
}
