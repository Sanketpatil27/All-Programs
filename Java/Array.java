import java.util.Scanner;

class Array {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        int id;
        int number;
        String add;
        String name;

        
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter student name, phone number, address, and age of Student "+ (i + 1) + ": " );
            name =  sc.next();
            number = sc.nextInt();
            add = sc.next();
            id = sc.nextInt();
            System.out.println();
          
            // for (int j = 0; j <= i; j++)  {
                System.out.println("Information of Student " + (i + 1) + ":  ");
                System.out.println("Name = " + name);
                System.out.println("Address = " + add);
                System.out.println("Number = " + number);
                System.out.println("Id = " + id);
                System.out.println();
            // }
        }
    }
}