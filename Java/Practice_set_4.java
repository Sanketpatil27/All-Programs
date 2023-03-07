import java.util.Scanner;

public class Practice_set_4 {

    public static void main(String args[]) {

        // Q1 
        // int a = 10;
        // if (a = 11) {               // it will throw an error
        //     System.out.println("im 11");
        // }
        // else {
        //     System.out.println("im not");
        // }

        // Q2
        Scanner c = new Scanner(System.in);
        // float m, e, p;

        // System.out.println("Enter your maths, english and programming marks out of 100 respectively: ");
        // m = c.nextFloat();
        // e = c.nextFloat();
        // p = c.nextFloat();

        // float per = ((m + e + p)/300) * 100;

        // System.out.println("Your percentages: "+ per);

        // if (per > 40 && m > 33 && e > 33 && p > 33) {
        //     System.out.println("You are pass");
        // }
        // else {
        //     System.out.println("You are fail!!");
        // }

        // Q4  
        
        // System.out.println("Enter a number between 1 to 7");
        // int num = c.nextInt();

        // switch(num)
        // {
        //     case 1 -> System.out.println("Monday");
        //     case 2 -> System.out.println("Tuesday");
        //     case 3 -> System.out.println("wednesday");
        //     case 4 -> System.out.println("thursday");
        //     case 5 -> System.out.println("Friday");
        //     case 6 -> System.out.println("Saturday");
        //     case 7 -> System.out.println("Its weekend");
        //     default ->  System.out.println("Wrong Input!!") ;
        // }

        System.out.print("Enter any Website: ");
        String web = c .next();

        if(web.endsWith(".com")) {
            System.out.println("This is Commertial Wensite...");
        }
        else if (web.endsWith(".in")) {
            System.out.println("THis is Indian Website....");
        }
        else if (web.endsWith(".org")) {
            System.out.println("This is Organization Website");
        }
        else {
            System.out.println("No data found!!!");
        }
    }
}
