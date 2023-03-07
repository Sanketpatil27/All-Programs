public class Finally_In_Exceptions {

    static int use() {
        int a = 35, b = 7, res = 0;

        while(true) {
            try {
                res = a / b;
                System.out.println("Division: " + res);
                b--;
            }
            catch(Exception e) {
                System.out.println(e);
                return -1;                 // even if returned finally will work
            }

            finally {               // finally code runs even if program is break or returned in upward code
                res = a + b;
                System.out.println("Addition: " + res);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(use());
    }
}
