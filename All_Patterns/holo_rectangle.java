import java.util.Scanner;

//                    *****
//                    *   *
//                    *   *
//                    *****

class holo_rectangle {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("Enter how many rows you want in holo rectangle: ");
        int n = x.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n-1 || j == n-1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}