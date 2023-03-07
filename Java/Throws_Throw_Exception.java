class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be Negative";
    }
}

public class Throws_Throw_Exception {

    static double area(int r) throws NegativeRadiusException{
        if (r < 0) {
            throw new NegativeRadiusException();
        }
        return Math.PI * r * r;
    }

    static int div(int a, int b) throws ArithmeticException {
//        if (b == 0) {                       // optional lines
//            throw new ArithmeticException();
//        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
//            int result = div(3, 0);                        // first exception
//            System.out.println("Division = " + result);

            double ar = area(-6);                         // second exception
            System.out.println("Radius = " + ar);
        }
        catch (Exception e) {
            System.out.println("Exception!!!!");
            System.out.println(e.toString());     // toString only work when NegativeRadiusException throws, otherwise only consider e
        }
    }
}