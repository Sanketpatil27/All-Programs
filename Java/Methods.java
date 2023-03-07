import java.util.Scanner;

public class Methods {
    
    public static int add (int x, int y) {

        int c = x + y;
        return c;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Methods obj = new Methods();   // used when ni static in function , it is for object creation
        int a, b, c;
        System.out.println("Enter values of a & b:");
        a = sc.nextInt();
        b = sc.nextInt();

        c = add(a,b);    // used when static in function
        // c = obj.add(a,b);  // used when there is no static in function
        System.out.println("Addition = "+ c);
    }
}
