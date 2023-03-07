import java.util.Scanner;

public class Count_Positive_and_Negative {

    public static void count(int n, int[] arr) {
        int plus = 0, minus = 0;

                                                        // this prog can use with arrays
        for(int i = 0; i < n; i++ ) {
            if (arr[i] >= 0) {
                plus++; 
            }
        }
        System.out.println("Total positive numbers are: "+ plus);

        for(int i = 0; i < n; i++ ) {
            if (arr[i] < 0) {
                minus++; 
            }
        }
        System.out.println("Total negative numbers are: "+ minus);
    }
    
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        
        System.out.println("Enter how many numbers you want:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        
        System.out.println("Enter numbers: ");
        for(int i = 0; i < n; i++ ) {
            arr[i] = sc.nextInt();
        }

        count(n,arr);
    }
}
