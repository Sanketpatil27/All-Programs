public class VarArgs_Exercize {

    public static void AvgOf(float... arr) {
        float total = 0;
        int totalNo = 0;

        for (float element : arr) {
            total += element;
            totalNo++;              //-->   To Count Total No. In Array
        }
        System.out.println("Total No. = " + totalNo + "\nAddition = " + total);
        float avg = (total / totalNo);
        System.out.println("Average Of Entered No = " + avg);
    }

    public static void main(String[] args) {

        AvgOf(12, 12, 10, 10, 10, 10, 12);

    }
}
