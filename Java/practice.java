import java.util.Scanner;

public class practice
{
    public static void main(String[] args)
    {
        float r;

        System.out.print("Enter the value of radius: ");
        Scanner sc = new Scanner(System.in);  // only creat object as sc(any)
        
        r = sc.nextInt();
        // System.out.println(r);
        float area = 3.14F * r * r;
        System.out.print("Area of circle = ");
        System.out.println(area);
    }
}