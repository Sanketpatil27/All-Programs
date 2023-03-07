public class Command_Lne_Argument_Addition {
    
    public static void main(String[] bgn) {

        int a, b, c, sum  = 0;

        // a = Integer.parseInt(bgn[0]);
        // b = Integer.parseInt(bgn[1]);
        // c = a + b;
        // System.out.println("Addition = "+ c);


        // Integer.parseInt(bgn[i])    This statement converts char to int
        for (int i = 0; i < 6; i++) {

            a = Integer.parseInt(bgn[i]);
            sum = sum + a;

            // sum = sum + Integer.parseInt(bgn[i]);  both can be applicable
        }
        System.out.println("Adddition of first 6 arguments: "+ sum);
    }
}
