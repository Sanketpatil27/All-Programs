import java.util.Scanner;

public class Method_Odd_Numbers_Sum {

    public static void OddSum (int n) {

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if(i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("Odd numbers addition from 1 to "+ n + " = "+ sum);
    }

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.print("Enter a number till you want to add odd numbers: ");
        int n = x.nextInt();

        OddSum(n);
    }
}