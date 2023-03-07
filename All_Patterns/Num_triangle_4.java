import java.util.Scanner;

//                            1 2 3 4 5 6
//                            1 2 3 4 5
//                            1 2 3 4
//                            1 2 3
//                            1 2
//                            1

class Num_triangle_4 {

    public static void main(String args[]) {
        Scanner x =new Scanner(System.in);

        System.out.print("Enter how many rows with numbers you want: ");
        int r = x.nextInt();

        for (int i = r; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + (" "));
            }
            System.out.println();
        }
    }
}