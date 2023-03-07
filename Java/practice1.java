import java.util.Scanner;

public class practice1
{
    public static void main(String[] args)
    {
        System.out.print("Enter a number to make table: ");
        Scanner x = new Scanner(System.in);

        final int table = x.nextInt();  // final means constant variable
        
        System.out.println(table*1);
        System.out.println(table*2);
        System.out.println(table*3);
        System.out.println(table*4);
        System.out.println(table*5);
        System.out.println(table*6);
        System.out.println(table*7);
        System.out.println(table*8);
        System.out.println(table*9);
        System.out.println(table*10);
    }
}