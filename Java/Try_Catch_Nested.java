public class Try_Catch_Nested {
    public static void main(String[] args) {
        int a = 1, b = 0, res;

        try {
            try {
                a = Integer.parseInt(args[0]);
                b = Integer.parseInt(args[1]);

                res = a / b;
                System.out.println("Division = " + res);
                System.out.println(args[3]);
            }
            catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero");
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e);
        }

        res = a + b;
        System.out.println("Addition  = " + res);
    }
}