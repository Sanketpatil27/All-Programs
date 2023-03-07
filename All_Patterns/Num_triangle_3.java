import java.util.Scanner;

//                  1
//                  1 2
//                  1 2 3
//                  1 2 3 4

class Num_triangle_3 {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.print("How many numbers of ladder you want: ");
        int num = x.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}