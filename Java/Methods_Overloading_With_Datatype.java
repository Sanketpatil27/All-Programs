//                                      -->   Overloading with data_type Not return_Type

class Adder {
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }
}

public class Methods_Overloading_With_Datatype {
    public static void main(String[] args) {
        int a = 3;
        System.out.println(Adder.add(a, 987));
        System.out.println(Adder.add(a, 987.565));
    }
}
