import java.util.*;

class Matrix {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[3][3];

        System.out.println("Enter even values in your matrix:");

        for (int i = 0; i < a.length; i++) {
             for (var j = 0; j < a[i].length; j++) {
                
                while(true) {
                    
                    a[i][j] = sc.nextInt();

                    if((a[i][j] % 2) != 0) {
                        System.out.println("Only even values allowed, choose again!!!");
                    }
                    else {
                        break;
                    }
                }
             }
        }
        
        System.out.println("Entered even values are:");
        for (int i = 0; i < a.length; i++) {
             for (int j = 0; j < a[i].length; j++) {  
                    System.out.print(a[i][j] + " ");
             }
             System.out.println();
        }
    }
}