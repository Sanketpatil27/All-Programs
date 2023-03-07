
public class Operator_precedance {

    public static void main(String[] args) {

        int a = 9, b = 4, c = 99;

        float sum = (c - a) / (a * b) ;   // if both are high precedance then left to right operations

        System.out.println(sum);
    }
}