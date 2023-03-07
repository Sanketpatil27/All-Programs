public class triangle2 {

    public static void main(String[] a) {

        int n = 6;

        for (int i = 1; i <=  n; i++) {
            
            // for spaces----
            for (int j = n-i; j >=1; j--) {
                System.out.print(" ");
            }

            // for stars----
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
