import java.util.Scanner;
class Solid_Rectangle {

    public static void main(String[] br) { // we can use any name instead of args

        Scanner obj = new Scanner(System.in);


        System.out.print("Enter how many lines you want in Rectangle: ");
        int n = obj.nextInt();
        System.out.print("How many Stars you want in one row: ");
        int stars = obj.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}