import java.util.Scanner;

public class Exercize {

    public static void main(String[] args) {

        Scanner z = new Scanner(System.in);

        float m1, eng, m2, prg;

        System.out.println("Enter Your marks of m1, m2, eng, prg out of 100");
        m1 = z.nextFloat();
        m2 = z.nextFloat();
        eng = z.nextFloat();
        prg = z.nextFloat();

        float obtainedmarks = m1 + m2 + eng + prg;
        float totalmarks = 400 ;
        float perce = (obtainedmarks/totalmarks)*100;

        System.out.print("Your Percentage = " + perce);
        // System.out.println(perce);
    }
}