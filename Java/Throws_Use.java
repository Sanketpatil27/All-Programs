import java.util.Scanner;

class NegativeRadiusException1 extends Exception {
    @Override
    public String toString() {
        return "Radius Cannot be Negative";
    }
}

public class Throws_Use {

    static double area(int r) throws NegativeRadiusException1 {
        if (r < 0) {
            throw new NegativeRadiusException1();
        }

        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        int r = sc.nextInt();

        try {
            double res = area(r);
            System.out.println("Area of circle = " + res);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}