import java.util.Scanner;

public class Try_Catch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] d = new int[2];
        int res;

//        for (int l: d) {          // --> not working
//            d[l] = sc.nextInt();
//        }

        try {
            System.out.println("Enter an array: ");
            for (int i = 0; i < d.length; i++) {
                d[i] = sc.nextInt();
            }
            d[2] = 23;       // Exception

            res = d[0] / d[1];
            System.out.println("Division = " + res);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by Zero!!");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e);
        }
        catch (NumberFormatException e) {
            System.out.println("Exception Occur!!!");
        }
        catch (Exception e) {
            System.out.println("Exception Occur " + e);
        }

        res = d[0] + d[1];
            System.out.println("Addition = " + res);
    }
}