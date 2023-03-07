import java.util.Scanner;

                            // 3! = 3*2*1

class Factorial {

    // With Recursion -->
    static int fact(int n) {

        if (n == 1 || n == 0) {
            return 1;
        }

        return   n * fact(n - 1);
    }

    public static void main(String[] avs) {

        Scanner z = new Scanner(System.in);

        System.out.print("Enter a number for Factorial: ");
        int n = z.nextInt();

        int factorial = 1;

        System.out.print("factorial of "+ n +" = ");
        for (int i = n; i>= 1; i--) {

            factorial *= i;
        }
        System.out.println(factorial);

        System.out.println("Result With Recursion: " + fact(n));
    }
}