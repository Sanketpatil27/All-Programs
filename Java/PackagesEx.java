package calcy;

class Calculator {
    void calculate(int a, int b) {
        System.out.println("Your result is: "+ a+b);
    }
}

class ScientificCalculator {
    void calculate(int a, int b) {
        System.out.println("Your result is: "+ Math.sin(a+b));
    }
}

class HybridCalculator {
    void calculate(int a, int b) {
        System.out.println("Your result is: "+ a+b);
        System.out.println("Your result is: "+ Math.cos(a+b));
    }
}

class PackagesEx {
    public static void main(String[] args) {

        //PackagesEx p = new PackagesEx();
        Calculator c = new Calculator();
        HybridCalculator h = new HybridCalculator();
        ScientificCalculator sc = new ScientificCalculator();

        c.calculate(12,34);
        sc.calculate(12,34);
        h.calculate(12,34);
    }
}