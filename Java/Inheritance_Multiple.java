interface PI1 {

    default void show() {
        System.out.println("Default PI1");
    }
}

interface PI2 {

    default void show1() {
        System.out.println("Default PI2");
    }
}

class Greet {

    void greet() {
        System.out.println("Hello");
    }
}

class Inheritance_Multiple extends Greet implements PI1, PI2 {

    public void show2() {

        System.out.println("Good Morning...");
    }


    public static void main(String[] args) {

        Inheritance_Multiple d = new Inheritance_Multiple();
        d.show();
        d.show1();
        d.show2();
        d.greet();
    }
}