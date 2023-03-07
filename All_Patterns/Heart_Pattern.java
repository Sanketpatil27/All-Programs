           
 //                                        **        **
 //                                       ****      ****
 //                                      ******    ******
 //                                     ********  ********
 //                                    ********************
 //                                    ********************
 //                                     ******************
 //                                      ****************
 //                                       **************
 //                                        ************
 //                                         **********
 //                                          ********
 //                                           ******
 //                                            ****
 //                                             **
 //                                    
 //                                    ------  LOVE  ------


public class Heart_Pattern {
    public static void main(String[] args) {
        int n = 5;

        System.out.println();
        
        // upside part -->
        for (int i = 1; i <= n; i++) {

            // for left side Spaces
            for (int j = 1; j <= n-i; j++ ) {
                System.out.print(" ");
            }

            // for left side stars
            for (int j = 1; j <= i; j++) {
                System.out.print("**");
            }

            // for middle spaces
            for (int j = 1; j <= 2*(n-i); j++ ) {
                System.out.print(" ");
            }

            // for right side stars
            for (int j = 1; j <= i; j++) {
                System.out.print("**");
            }

            System.out.println();
        }

        // down part -->
        int n1 = 10;

        for (int i = n1; i >= 1; i--) {

            // for spaces
            for (int j = n1-i; j >= 1; j--){
                System.out.print(" ");
            }

            // for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("**");
            }
            System.out.println();
        }

        System.out.println("\n------  LOVE  ------\n");
    }
}