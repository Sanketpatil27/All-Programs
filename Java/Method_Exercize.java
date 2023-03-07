import java.util.Scanner;

class Method_Exercize {

    public static void Avg(int a, int b, int c) {

        int avge  = (a + b + c) / 3;
        System.out.println("Your marks average = "+ avge);

    }


    public static void main(String[] acn) {

        Scanner z = new Scanner(System.in);

        System.out.println("Enter your 3 subject marks: ");
        int mark1 = z.nextInt();
        int mark2 = z.nextInt();
        int mark3 = z.nextInt();

        Avg(mark1, mark2, mark3);
    }
}