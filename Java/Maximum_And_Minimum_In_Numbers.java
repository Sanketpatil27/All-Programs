import java.util.Scanner;

public class Maximum_And_Minimum_In_Numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Minimum number = " + Min(a,b,c));
        System.out.println("Maximum number = " + Max(a,b,c));
    }

    static int Min(int a, int b, int c) {
        return Math.min(Math.min(a,b),c);
    }

    static int Max(int a, int b, int c) {
        return Math.max(Math.max(a,b),c);
    }
}