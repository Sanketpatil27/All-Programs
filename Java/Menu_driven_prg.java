import java.util.Scanner;

public class Menu_driven_prg {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        int ch;
        System.out.println("\nEnter 1.For Filling marks  \nEnter 0.for stop:");
        ch = obj.nextInt();

        do {

            switch (ch) {

                case 1:
                    System.out.print("Enter your Obtained Marks out of 100: ");
                    int marks = obj.nextInt();

                    if (marks > 100) {
                        System.out.println("Invalid input!!!");
                    } 
                    else {
                        if (marks >= 90) {
                            System.out.println("class A");
                        } 
                        else if (marks <= 89 && marks >= 60) {
                            System.out.println("Class B");
                        } 
                        else {
                            System.out.println("Class c");
                        }
                    }
                    System.out.println("\nEnter 1.For Filling marks  \nEnter 0.for stop:");
                    ch = obj.nextInt();
                    break;

                case 0:
                    System.out.println("Log Out!!!");
                    return;

                default:
                    System.out.println("Wrong Input!!");
            }
        } while (ch == 1);
    }
}