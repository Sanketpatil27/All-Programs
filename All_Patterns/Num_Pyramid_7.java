//          1 
//         2 2 
//        3 3 3 
//       4 4 4 4 
//      5 5 5 5 5 


class Num_Pyramid_7 {

    public static void main(String[] args) {

        int n = 5;
        // int counter  = 1;
        for (int i = 1; i <= n; i++) {
            // For Spaces-----
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            // For Numbers-----
            for (int j = 1; j <= i; j++) {
                System.out.print(i+ " ");
                // Sytem.out.print("* ");   // this can also work
                // System.out.print(counter+ " ");
                // counter++;
            }
            System.out.println();
        }
    }
}