import java.util.Scanner;

public class String_01 {

    public static void main(String[] args) {

        String name = "Hello Coder";
        name = "hiii";
        System.out.println(name);

        Scanner x = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = x.nextLine();
        
        // System.out.println(name);
        System.out.printf("You have entered %s", name);     // For c programming coders___________

        
    }
}