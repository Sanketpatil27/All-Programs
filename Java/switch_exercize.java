import java.util.Scanner;

public class switch_exercize {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the number of month you want to know: ");
        int month = obj.nextInt();

        switch (month) {
            case 1:
                System.out.println("This number stands for - January");
                break;

            case 2:
                System.out.println("This number stands for - Feabruary");
                break;

            case 3:
                System.out.println("This number stands for - March");
                break;

            case 4:
                System.out.println("This number stands for - April");
                break;

            case 5:
                System.out.println("This number stands for - May");
                break;

            case 6:
                System.out.println("This number stands for - June");
                break;

            case 7:
                System.out.println("This number stands for - July");
                break;

            case 8:
                System.out.println("This number stands for - August");
                break;

            case 9:
                System.out.println("This number stands for - September");
                break;

            case 10:
                System.out.println("This number stands for - October");
                break;

            case 11:
                System.out.println("This number stands for - November");
                break;

            case 12:
                System.out.println("This number stands for - December");
                break;

            default:
                System.out.println("Enter 1 to 12!!");
        }

        // Inhanced Switch dont need of break statement

        System.out.println("Enter a number between 1 to 7");
        int num = obj.nextInt();

        switch(num)
        {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Its weekend");
            default ->  System.out.println("Wrong Input!!") ;
        }

    }
}