import java.util.Scanner;

class Searching_in_array {

    public static void main(String[] args) {

        Scanner d = new Scanner(System.in);

        System.out.print("How long you create an array: ");
        int n = d.nextInt();

        int[] a = new int[n];

        System.out.println("Enter your array: ");
        for(int i = 0; i < a.length; i++) {
            a[i] = d.nextInt();
        }

        System.out.print("Enter a number you want to search in  array: ");
        int key = d.nextInt();
        int flag = 0;

        for(int i = 0; i < a.length; i++) {
            if(a[i] == key) {
               System.out.println("Your element is found at index "+ i);
               flag = 1;
               break;
            }
        }
        
        if(flag == 0){
            System.out.println("Your element is not found!!!");
        }
    }
}