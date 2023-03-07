public class constructors {

    // default constructor---->

    // constructors () {
    //     int a = 20, b = 45, c;
    //     c = a + b;
    //     System.out.println("Addition = "+ c);
    // }

    // parameterised constructor ----->
    constructors (int a, int b) {
            
            int c = a + b;
            System.out.println("Addition = "+ c);
        }
    
    
    public static void main(String [] ab) {

        // constructors x = new constructors();    // for default

        // for parameterised
        int x = 45645, y = 54879;
        constructors z = new constructors(x, y);

    }
    
}
