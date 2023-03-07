//        *
//       * *
//      * * *
//     * * * *
//    * * * * *
//    * * * * *
//     * * * *
//      * * *
//       * *
//        *



public class UpsideDownPyramid_10 {
    
    public static void main(String args[]) {

        int n = 5;

        // First Half
        for (int i = 1; i <= n; i++) {

            // for Spaces
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }

            // for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Second Half(1)
        // for (int i = 1; i <= n; i++) {

        //     // spaces (1) diff pyramid
        //     // for (int j = i; j > 1; j-- ) {
        //     //     System.out.print(" ");
        //     // }
        //     // spaces (2) diff pyramid
        //     for (int j = n; j > n-i; j--) {
        //         System.out.print(" ");
        //     }

        //     // stars
        //     for (int j = n; j >= i; j--) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // second half(2)
        for (int i = n; i >= 1; i--) {

            // for Spaces
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }

            // for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    } 
}
