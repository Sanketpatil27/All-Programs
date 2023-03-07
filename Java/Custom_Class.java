import java.util.Scanner;

class Employee {
    int id = 34;
    String name;
    int salary;

    void get() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Salary: ");
        salary = sc.nextInt();
    }
    void display() {
        System.out.println("Employee Salary = " + salary);
        System.out.println("Employee id = " + id);
        System.out.println("Employee name = " + name);
    }
}

public class Custom_Class {
    public static void main(String[] args) {
        Employee x = new Employee();
        x.id = 23;
        x.name = "R.D.J";

        System.out.println("Employee id = " + x.id);
        x.get();
        x.display();
    }
}
