import java.util.Scanner;

public class Prime_Factor {

    private static void Prime_Fact(int n) {
        int i = 2;

        while ( n > 1) {
            if (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;       // this is for when we divide 4 by 2 then next we divide that remaining 2 not again 4
            }
            else
                i++;        // i doesn't  divide then it get increases
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find its prime Factors: ");
        int n = sc.nextInt();

        System.out.print("Prime Factors of " + n + " =  ");
        Prime_Fact(n);
    }
}
