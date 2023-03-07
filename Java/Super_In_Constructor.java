class Person {
    int id;
    String name;

    Person(int a, String nm) {          // Accessing constructor with super()
        id = a;
        name = nm;

        System.out.println("Id = " + id + "\nName = " + name);
    }
}

class MyEmployee extends Person {
    float salary;

    MyEmployee(float sal) {
        super(23,"Harry");
        salary = sal;

        System.out.println("Employee salary = " + salary);
    }
}

public class Super_In_Constructor {
    public static void main(String[] args) {

        MyEmployee me = new MyEmployee(300000.00f);
    }
}
