import java.util.Scanner;

class Stud {

    int roll;
    String name, dept, city;

    static Scanner sc = new Scanner(System.in);

    void getRollName() {
        System.out.print("Enter Roll No. of the student: ");
        roll = sc.nextInt();
        System.out.println("Enter Name of the student: ");
    }

    void setRollName() {
        System.out.println("Roll no. = " + roll + "\nName = " + name);
    }
}

class Dept extends Stud {

    void getDept() {
        System.out.print("Enter Student Department: ");
        dept = sc.nextLine();
    }

    void setDept() {
        System.out.println("Student department name = " + dept);
    }
}

class City extends Dept {

    void getCity() {
        System.out.println("Enter City name of student: ");
        city = sc.nextLine();
    }

    void setCity() {
        System.out.println("Student City name = " + city);
    }
}

public class Inheritance_Multi_Level {
    public static void main(String[] ar) {

        City c = new City();
        c.getRollName();
        c.getDept();
        c.getCity();
        System.out.println("\nShowing Student Details: ");
        c.setRollName();
        c.setDept();
        c.setCity();
    }
}