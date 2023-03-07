import java.util.Vector;

public class Vector_Class {

    public static void Add() {
        Vector z = new Vector();
        z.addElement(2);
        z.add(3);
        z.addElement(9);
        System.out.println(z);
    }

    public static void main(String[] args) {
        /// Vector<Integer> x = new Vector<Integer>();
        /// x.add(1);
        // x.add(2);

        Vector <String> x = new Vector <String>();
        x.add("Lion");
        x.add("Tiger");
        x.add("Shark");
        x.add("Whale");
        x.add("Piranha");

        /// x.removeElement("Lion");
        // x.remove("Lion");
        Add();
        System.out.println(x);
        System.out.println("First Element: "+ x.firstElement());
        System.out.println("Last Element: "+ x.lastElement());
        System.out.println("Size Of Vector: "+ x.size());
        System.out.println("Capacity Of Vector: "+ x.capacity());  // capacity gets double when it crosses limits of his 10 values by default

        /// x.removeAll();
        // x.removeElementAt(3);
        /// System.out.println(x);

        System.out.println("Element At 1: "+ x.get(1));
        System.out.println("Index of shark: "+ x.indexOf("Shark"));

         System.out.println("Hash code of vector "+ x.hashCode());

    }
}
