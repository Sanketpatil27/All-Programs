                    // Position of Number == 1 2 3 4 5 6 7 08 09 10
                    // fibonacci series ==   0 1 1 2 3 5 8 13 21 34

import java.util.Scanner;

public class Fibonacci {

    static int fib (int n) {
        /*
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        */   // replacing both with one
        if (n == 1 || n == 2) {
            return n - 1;
        }

        return  fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        System.out.print("Enter n th number to find Fibonacci of it: ");
        Scanner z = new Scanner(System.in);
        int n = z.nextInt();

        System.out.println(fib(n));
    }
}
