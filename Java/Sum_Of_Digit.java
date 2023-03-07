import java.util.Scanner;

public class Sum_Of_Digit {

    static int SumDig(int num) {        // ex. num = 126

        int sum = 0, rem = 0;         //  r for reminder of number

        while (num > 0) {
            rem = num % 10;         // it will return the last digit of a number  ( 6 in this case )
            sum += rem;             // Same As sum = sum + rem
            num = num / 10;         // it will get second last digits....( 2, 1, .. in this case )  & also update num value for While Loop
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);

        System.out.print("Enter a number to count the sum of digits in it: ");
        int n = z.nextInt();

        System.out.println("The Sum of Digits in the number " + n + " is: " + SumDig(n));
    }
}