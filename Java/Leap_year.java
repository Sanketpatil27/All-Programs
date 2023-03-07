import java.util.Scanner;

public class Leap_year {

    public static void main(String[] args) {

        Scanner b = new Scanner(System.in);

        System.out.println("Enter an year to check whether it is leap year or not: ");
        int year = b.nextInt();

        if ( year % 400 == 0) {
            System.out.println("This is leap year");
        }
        else if (year % 100 == 0){
            System.out.println("This is a not a leap year!!");
        }
        else if (year % 4 == 0){
            System.out.println("This is a leap year");
        }

        else {
            System.out.println("This is not a leap year!!");
        }
    }
}
