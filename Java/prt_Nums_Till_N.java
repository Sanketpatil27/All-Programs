import java.util.Scanner;

public class prt_Nums_Till_N {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a number till you want to diaplay: ");
        int n = obj.nextInt();

        for (int i = 0; i <= n; i++) {

            System.out.println(i);
        }
    }
}