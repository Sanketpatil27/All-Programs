import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        int i = 1;
        int num;
        Scanner x = new Scanner(System.in);
        // ---------------- for ---------------------
        // for(int i = 1; i >= -100; i--) {

        // System.out.println(i);
        // }

    
        // --------------- While ---------------------
        // while (i <= 100) {

        // System.out.println(i);
        // i++;
        // }

        // ------------ do while --------------------
        // do {
        //     System.out.println(i);
        //     i = i + 1;   // i++

        // } while (i < 2);

        System.out.print("Enter a number which you want to make table: ");
        num = x.nextInt();
        
        do {
            System.out.println(num * i);
            i++;
        
        }while(i <= 10);
    }
}