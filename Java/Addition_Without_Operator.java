import java.util.Scanner;

public class Addition_Without_Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers for addition: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 1; i <= b; i++) {
            a++;
        }
        System.out.println("Addition = " + a);
    }
}
