//                        *          *
//                        **        **
//                        ***      ***
//                        ****    ****
//                        *****  *****
//                        ************
//                        ************
//                        *****  *****
//                        ****    ****
//                        ***      ***
//                        **        **
//                        *          *


public class Butterfly_Pattern_9 {
    
    public static void main(String[] abs) {

        int n = 6;

        // Upper Side--------------------------- -->
        for (int i = 1; i <= n; i++) {

            // First part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            // for Spaces
            for (int j = 1; j <= 2*(n-i); j++) {   // 2* for multiplying both side
                System.out.print(" ");
            }

            // Second Part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                // System.out.print(i);
            }
            System.out.println();
        }

        // (1)--Lower Side-------------------------     not scalable
        // for (int i = 1; i <= n; i++) {

        //     // First part
        //     for (int j = n; j >= i; j--) {
        //         System.out.print("*");
        //     }

        // (2)--Lower Side------------------------- -->
        for (int i = n; i >= 1; i--) {               //   i can be n or (n - 1)

            // First part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            // For Spaces
            for (int j = 1; j <= 2*(n-i); j++ ) {    // 2* for multiplying both side
                System.out.print(" ");
            }

            // Second Part
            for (int j = 1; j <= i; j++ ) {
                System.out.print("*");
            }
           System.out.println();
        }
    }
}
