public class Exceptions_Types {
    public static void main(String[] args) {

        // Syntax Error, Semicolon Missing -->
        // int a

        // Logical Error, want addition but perform wrong instruction -->
        // int add, b = 34, c = 45;
        //  add = c / b;

        // Runtime Error, Always called Exceptions -->
        int div , a = 3, b = 0;
        div = a / b;
        System.out.println(div);
    }
}