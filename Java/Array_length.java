import java.util.Scanner;

class Array_length {

    public static void main(String args[]) {

        Scanner c = new Scanner(System.in);

        int n;
        System.out.print("Enter array length you want: ");
        n = c.nextInt();

        int[] arr = new int[n];

        System.out.println("Length of arr = "+ arr.length);
        
        System.out.println("Enter array:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = c.nextInt();
        }

        System.out.println("Your array: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nYour reversed array: ");
        for(int i = (arr.length-1); i >= 0; i--) {
            System.out.print(arr[i] +" ");
        }

        // for each loop->
        System.out.println("\nFor each loop: ");
       
        for(int element: arr){
            System.out.print(element +" ");
        }
    }
}