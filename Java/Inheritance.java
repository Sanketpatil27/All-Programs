import java.util.Scanner;

class Base {
    Scanner sc = new Scanner(System.in);

    void Animal () {
        System.out.print("Enter Your Favourite Animal: ");
        String a = sc.nextLine();
    }
}

class Derived extends Base {

    void Bark () {
        System.out.println("Dog Class Property will be Barking");
    }
}

public class Inheritance {
    public static void main(String[] args) {

        Base b = new Base();
        b.Animal();

        Derived d = new Derived();
        d.Animal();
        d.Bark();
    }
}
