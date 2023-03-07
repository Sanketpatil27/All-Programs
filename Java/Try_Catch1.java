import java.text.NumberFormat;

public class Try_Catch1 {
    public static void main(String[] args) {

        int a = 0, b = 0, res;

        try {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);

            res = a / b;
        }
        catch (NumberFormatException e) {
            System.out.println("Error Occur: " + e);
            throw e;
        }

        res = a + b;
        System.out.println("Addition = " + res);
    }
}
