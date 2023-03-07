import java.util.Scanner;

class Functions {


    public static float CalculateSum(float x, float v) {
        float sum = x + v;

        

        // System.out.println(sum);
        return sum;
    }


    public static void main(String[] args) {

        Scanner c = new Scanner(System.in);

        float a, b;
        String s;
        
        System.out.println("Enter values of a & b:");
        a = c.nextFloat();
        b = c.nextFloat();

        float sum = CalculateSum(a,b);
        System.out.println("Addition: "+sum);
    }
}