import java.util.Scanner;

class Multiplication_table {

    public static void main(String avvd[]) {

        Scanner x = new Scanner(System.in);
        
        System.out.print("Enter a number which you want to display reverse table: ");
        int n = x.nextInt();

        for (int i = 10; i >= 1; i--) {
        
            System.out.println(n+ " * "+  i +" = "+ i*n);
        }

        int cal = 0;
        System.out.print("Total count of numbers in table of "+ n + ": ");
        for (int i = 10; i >= 1; i--) {

            cal = cal + (i*n);
        }
        System.out.print(cal);
    }
}