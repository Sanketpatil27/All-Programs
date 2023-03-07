import java.util.Scanner;

public class convert_kilo_to_miles{

    public static void main(String[] args){

        // program to convert kiometer to mile

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter value in kilometer to convert in miles: ");
        float kilo = obj.nextFloat();

        float conversion = kilo * 0.62137f;

        System.out.print(kilo + " Kilometer = " + conversion + " Miles");
    }
}