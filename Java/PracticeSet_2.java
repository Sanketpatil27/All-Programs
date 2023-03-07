import java.util.Scanner;

public class PracticeSet_2 {

    public static void main(String[] args){

        // Q.1
        // float a = 7/4f * 9/2f;
        // System.out.println(a);
        // -----------------------------------------------------

        // Q.3
        Scanner obj = new Scanner(System.in);

        float b, num = 98;
        System.out.println("Enter a number: ");
        b = obj.nextFloat();

        boolean c = b > num;
        System.out.println("Number you have entered is greter than num: " + c);    
        System.out.println("Number you have entered is greter than num: " + (b > num));     // we also check like this
        // --------------------------------------------------------

        // Q.4
        // float d, u = 89f, v = 2f, a = 34f;
        // d = (v * v) - (u * u) / (2 * a * 5);
        // System.out.println(d);
        // ----------------------------------------------------------

        // Q.5
        // int x = 7;
        // int a = 7 * 49 / 7 + 35 / 7;
        // System.out.println(a);
        // --------------------------------------------------------
    }
}