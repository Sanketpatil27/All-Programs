// Program to count all unique or non-unique three-digit numbers using 1 2 3 4

public class Count_All_Three_Digit_Numbers {
    public static void main(String[] args) {

        int total = 0;

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
//                    if (k != i && k != j && i != j) {     // This shows all unique numbers
                        total++;
                        System.out.println(i + "" + j + "" + k);
//                    }
                }
            }
        }
        System.out.println("Total Three-Digit Numbers = " + total);
    }
}