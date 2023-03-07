import java.util.*;

class Addition_of_Matrix {

    public static void main(String[] anfx) {
        Scanner z = new Scanner(System.in);

        int[][] a = new int[2][3];
        // int[][] b = { {2,3} {3,5,7} };      // we can also initialize like this

        System.out.println("Enter your array: ");
        for(int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = z.nextInt();
            }
        }

        System.out.println("Your Matrix: ");
        for(int i = 0; i < a.length; i++) {             // row
            for(int j = 0; j < a[i].length; j++) {      // column
               
                System.out.print(a[i][j] + " ");
            }
            System.out.println();   
        }

        System.out.println("Addition of matrix: ");
        for(int i = 0; i < a.length; i++) {             // row
            for(int j = 0; j < a[i].length; j++) {      // column
               
                int add = a[i][j] + a[i][j];
                System.out.print(add + " ");
            }
            System.out.println();
        }
        
    } 
}