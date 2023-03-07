import java.util.*;

public class Method_To_PowerUp_Number {

    public static void PowerOf(double x, int y) {
        System.out.println(x + " ^ "+ y + " = " + Math.pow(x,y));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any two Numbers To Power up first No To second: ");
        double a  = sc.nextDouble();
        int b = sc.nextInt();

        PowerOf(a,b);
    }
}
