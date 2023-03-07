import java.util.*;

public class String_Buffer {
    public static void main(String[] args) {

        StringBuffer z = new StringBuffer("Java");

        z.append(" Lion");
        System.out.println(z);

        z.replace(1,3,"jvm");
        System.out.println(z);

        z.insert(6,"cpp");
        System.out.println(z);

        z.delete(1,3);
        System.out.println(z);

        System.out.println("Reversed String: " + z.reverse());
    }
}
