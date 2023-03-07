public class Exception_Exercise {
    public static void main(String[] args) {

        int a = 99, b = 0, div;

        try {
            div = a / b;
            System.out.println("Division = " + div);
        }
        catch (ArithmeticException e) {
            System.out.println("This is Arithmetic Exception!!!");
        }
        catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}
