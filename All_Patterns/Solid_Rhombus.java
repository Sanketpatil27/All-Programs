//          ******
//         ******
//        ******
//       ******
//      ******
//     ******

class Solid_Rhombus {
    public static void main(String[] abcd) {

        int  n = 6;

        for (int i = 1; i <= n; i++) {

            // for spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            // For Stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
                // System.out.print(i+" ");   // We can also print this new Patten 
            }
            System.out.println();
        }
    }
}