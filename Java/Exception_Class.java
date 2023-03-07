import java.util.Scanner;

class MyException extends Exception {

    @Override
    public String toString() {
//        return super.toString() + " I am toString";       // both are correct
        return "I am toString";
    }

    @Override
    public String getMessage() {
//        return super.getMessage() + "I am getMessage";
        return  "I am getMessage";
    }
}

class MaxAgeException extends Exception {

    @Override
    public String toString() {
        return "Age can not be greater than 125!!!";
    }

    @Override
    public String getMessage() {
//        return super.getMessage() + "I am getMessage";
        return  "Age cannot be negative";
    }
}

public class Exception_Class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, age;

        System.out.print("Enter value of a: ");
        a = sc.nextInt();

        System.out.print("Enter value of age: ");
        age = sc.nextInt();

        if (a < 99) {
            try {
                throw new MyException();                             //--> Used to throw custom exception
//                throw new ArithmeticException("This is an Exception!!!");
            }
            catch (Exception e) {
                System.out.println(e.getMessage()); // These methods only work when Custom Class Throw as exception
                System.out.println(e.toString());
//                System.out.println(e);          // automatically run toString() Method
                e.printStackTrace();              // --> Display like error

                System.out.println("Finished!!");
            }
            System.out.println("Yes Finished!!");
        }

//        if(age > 125) {
//            try {
//                throw new MaxAgeException();
//            }
//            catch (Exception e) {
//                System.out.println(e.toString());
//            }
//        }
    }
}