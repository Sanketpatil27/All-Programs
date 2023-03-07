import java.util.Scanner;

//  Associativity means direction of execution it can be left to right or right to left
public class associativity {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        // Question 1:-
        // System.out.println("Enter values of x & y:");
        // float x = obj.nextFloat();
        // float y = obj.nextFloat();

        // float div = (x - y) / 2;
        // System.out.println(div);

        // Question 2:-
        System.out.println("Enter values of a, b & c:");
        float b = obj.nextFloat();
        float a = obj.nextFloat();
        float c = obj.nextFloat();

        float div1 = b * b - 4 * a * c;
        System.out.println(div1);
    }
}