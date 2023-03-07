class Phone {

    void ringing() {
        System.out.println("phone is ringing...");
    }

    void on() {
        System.out.println("Turning on phone...");
    }

    void model() {
        System.out.println("This is Nokia Phone...");
    }
}

class IPhone extends Phone {
    @Override
     void ringing() {
        System.out.println("IPhone is ringing...");
    }
}

class SmartPhone extends Phone {
    
    @Override
    void on() {
        System.out.println("Turning on SmartPhone...");
    }

    @Override
    void ringing() {
        System.out.println("SmartPhone is ringing...");
    }
    void takingPhoto() {
        System.out.println("SmartPhone is capturing photo...");
    }
}

public class Dynamic_Method_Dispatch {
    
    public static void main(String[] args) {    // runtime polymorphism cannot be achieved by data members

        //SmartPhone obj1 = new Phone();          // not allowed
        Phone obj = new SmartPhone();             // reference of Phone class & object of SmartPhone class
        obj.model();                              // Only can access methods of SuperClass & overridden method of SubClass.
        obj.ringing();
        obj.on();
//        obj.takingPhoto();                      // not allowed getting error... coz this is sub-class method
        obj = new IPhone();
        obj.ringing();


        SmartPhone obj1 = new SmartPhone();
        obj1.takingPhoto();
        obj1.ringing();

        Phone obj2 = new Phone();
        obj2.ringing();
    }
}
