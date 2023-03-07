interface Bike {
    int a = 45;                    // we can also take properties in interface  ||  All properties in interface are final...
    void applyBreak(int decrement);
    void speedUp(int increment);

//    default void model() {                       // interfaces can't have non-abstract methods, in like abstract class
//        System.out.println("Tesla Model X");     // But we can create with static and default access modifiers
//    }
}

interface HornBike {
    void blowHorn();
}

class Tesla implements Bike, HornBike {

    public void applyBreak(int decrement) {         // --> ALl override methods must be public
        System.out.println("Tesla decreasing speed");
    }

    public void speedUp(int increment) {
        System.out.println("Tesla using Boost");
    }

    public void blowHorn() {
        System.out.println("peep peep");
    }
}

public class Interface_Class {
    public static void main(String[] args) {
        // Bike b = new Bike();   // we can't create object of interface becoz it's abstract
        // Bike b1 = new Tesla();    // both accessible
        Tesla b = new Tesla();
        b.applyBreak(23);
        b.speedUp(567);
        b.blowHorn();
        // b.model();
        // b.a = 57;        // Error coz its final
    }
}
