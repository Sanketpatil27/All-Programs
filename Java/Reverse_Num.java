import java.util.Scanner;

public class Reverse_Num {

    static void Reverse (int n) {
        int rem = 0;

        while (n > 0) {
            rem = n % 10;                // rem is remaining reminder
            System.out.print(rem);
            n = n / 10;
        }
    }

    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);

        System.out.print("Enter a number to reverse it: ");
        int n = z.nextInt();

        System.out.print("Reverse number of " + n + " is:  ");
        Reverse(n);
    }
}
