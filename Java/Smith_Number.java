import java.util.Scanner;

public class Smith_Number {

    static int SumDig(int num) {        // ex. num = 126
        int sum = 0, rem = 0;         //  r for reminder of number

        while (num > 0) {
            rem = num % 10;         // it will return the last digit of a number  ( 6 in this case ) by dividing 10
            sum += rem;             // Same As sum = sum + rem
            num = num / 10;         // it will get second last digits....( 2, 1, .. in this case )  & also update num value for While Loop
        }
        return sum;
    }

    private static int Sum_Prime_Fact(int n) {
        int i = 2;
        int sum = 0;

        while ( n > 1) {
            if (n % i == 0) {
                sum += SumDig(i);   // it will get the sum of digits of i  number
                n = n / i;       // this is for when we divide 4 by 2 then next we divide that remaining 2 not again 4
            }
            else
                i++;        // i doesn't  divide then it get increases
        }
        return sum;
    }

    private static void Prime_Fact(int n) {
        int i = 2;
        int sum = 0;

        while ( n > 1) {
            if (n % i == 0) {
                System.out.print((i + " "));   // it will get the sum of digits of i  number
                n = n / i;       // this is for when we divide 4 by 2 then next we divide that remaining 2 not again 4
            }
            else
                i++;        // i doesn't  divide then it get increases
        }
    }

    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);

        System.out.print("Enter a number to find it's Smith number or not: ");
        int n = z.nextInt();

        System.out.print("Prime factors of Entered Number: ");
        Prime_Fact(n);
        System.out.println("\nSum of prime factor digits = " + Sum_Prime_Fact(n));
        System.out.println("The Sum of Digits in the number " + n + " is: " + SumDig(n));

        if (SumDig(n) ==  Sum_Prime_Fact(n)) {
            System.out.println(n + " is Smith Number");
        }
        else
            System.out.println("It's Not Smith Number!!");
    }
}