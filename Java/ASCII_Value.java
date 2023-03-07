import java.util.Scanner;

public class ASCII_Value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ch = 'Z';

        System.out.println(ch);

        // Exercise -->
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        System.out.format("%d + %d%d  + %d%d%d\n", n, n, n, n, n, n);
    }
}