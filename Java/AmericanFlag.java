public class AmericanFlag {
    public static void main(String[] args) {
        int n = 6;

        System.out.println("\n\t  A  M  E  R  I  C  A  N    F  L  A  G");
        // for first part -->
        for (int i = 1; i <= n; i++) {

            //for spaces -->
            for (int j = 1; j <= n; j++) {
                System.out.print(" ");
            }

            //for stars -->
            for (int j = 1; j <= n+3; j++) {
                System.out.print("*");
            }
            // spaces ->
            for (int j = 1; j <= n-2; j++) {
                System.out.print(" ");
            }

            // for = operator
            for (int j = 1; j <= n*4; j++) {
                System.out.print("=");
            }
            System.out.println();
        }

        //for second part -->
        for (int i = 1; i <= n-2; i++) {

            //for spaces -->
            for (int j = 1; j <= n; j++) {
                System.out.print(" ");
            }

            // for '=' operator
            for (int j = 1; j <= n*6+1; j++) {
                System.out.print("=");
            }
            System.out.println();
        }
        
        System.out.println();
    }
}