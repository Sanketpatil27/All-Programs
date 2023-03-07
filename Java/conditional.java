import java.util.Scanner;

public class conditional{

    public static void main(String[] args){

        float a,b,c;

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter values of a, b & c: ");
        a = obj.nextFloat();
        b = obj.nextFloat();
        c = obj.nextFloat();

        if(a > b){
            if(a > c){
                System.out.println("a is greater");
            }
            else{
                System.out.println("c is greater");
            }
        }
        else if(b > c){
            System.out.println("b is greater");
        }
        else{
            System.out.println("c is greater");
        }

        System.out.println("Choose:- \n1.For addition\n2.for substraction\n3.For division\n4.For multiplication");
        
        int ch = obj.nextInt();
        switch(ch){
            case 1:  System.out.println(a+b+c);
            break;

            case 2: System.out.println(a-b-c);
            break;

            case 3: System.out.println(a/b/c);
            break;

            case 4: System.out.println(a*b*c);
            break;

            default: System.out.println("Wrong choice");
        }
    }
}