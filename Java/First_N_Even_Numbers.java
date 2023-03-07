import java.util.Scanner;

class First_N_Even_Numbers {

    public static void main(String[] args) {

        Scanner z = new Scanner(System.in);

        // System.out.print("Enter a number till you want to display natural numbers: ");
        // int n = z.nextInt();
        // int i = 1;

        // while(i <= n) {
        //     System.out.print(i +" ");
        //     i++;
        // }
    
        System.out.println("Enter a number till you want to dsplay even numbers: ");
        int n = z.nextInt();
        int i = 1;
        int sum = 0;

        System.out.printf("natural numbers till %d: \n", n);
        while(i <= n) {
            if (i % 2 == 0){
                System.out.print(i+ " ");
            }
            i++;
        }
        
        i = 1;
        while(i <= n) {
            if (i % 2 == 0){
                sum = sum + i;
            }
            i++;
        }
        System.out.printf("\nSum of first %d even numbers: = %d",n, sum);
    }
}