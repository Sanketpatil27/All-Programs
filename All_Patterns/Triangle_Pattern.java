import java.util.Scanner;

                            //           *
                            //           **
                            //           ***
                            //           ****
                            //           *****

class Triangle_Pattern {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        int n;
        System.out.print("Enetr number of lines you want in triangle: ");
        n = obj.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}