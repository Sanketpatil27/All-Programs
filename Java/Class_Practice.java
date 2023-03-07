import java.util.Scanner;

class Employee1 {
    int salary;
    String name;

    Scanner sc = new Scanner(System.in);

    String getName() {
        System.out.println("Enter Your Name: ");
        name = sc.nextLine();
        return name;
    }

    int getSalary() {
        System.out.println("Enter Your Salary: ");
        salary = sc.nextInt();
        return salary;
    }

    String setName() {
        System.out.println("Enter a new name: ");
        name = sc.nextLine();
        return name;
    }
}

public class Class_Practice {
    public static void main(String[] args) {
        Employee1 sc = new Employee1();

        System.out.println(sc.getName());
        System.out.println(sc.getSalary());
        System.out.println(sc.setName());
    }
}
