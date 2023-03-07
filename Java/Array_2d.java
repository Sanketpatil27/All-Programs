import java.util.Scanner;

public class Array_2d {
    
    public static void main(String argc[]) {

        Scanner sc = new Scanner(System.in);

        int[][] a = new int [2][3];
        // System.out.println(a[1].length);     length of a[0] or a[1]

        // ("You can also use this:")
        a[0][0] = 1;
        a[0][1] = 2;
        a[0][2] = 3;
        a[1][0] = 4;
        a[1][1] = 5;
        a[1][2] = 6;
        
        System.out.println("Enter an array: ");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Your array: ");

        for (int i = 0; i < a.length; i++) {                // for rows
            for (int j = 0; j < a[i].length; j++) {        // for column  a[i].length coz a[0] have 3 cols & a[1] have 3 cols
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        // int [][] c = new int[2][3];   // we also use this
        System.out.println("addition: ");
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++) {

                int c = a[i][j] + a[i][j];
                System.out.print(c + " ");
                // c[i][j] = a[i][j] + a[i][j];          // we also use this
                // System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("enhanced: ");
        for (int[] el: a) {

            for (int ele: el) {

                int c = ele + ele;
                System.out.print(c + " ");
                //int c = a[i][j] + a[i][j];
                //System.out.print(c + " ");
                // c[i][j] = a[i][j] + a[i][j];          // we also use this
                // System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        
        
        // System.out.println("\" \\ Billionaire\"");   // Escape Statement
    }
}
