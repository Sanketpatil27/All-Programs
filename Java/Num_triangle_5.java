//                                1
//                                2 3
//                                4 5 6
//                                7 8 9 10

class Num_triangle_5 {

    public static void main(String[] args) {

        int r = 5;
        int number = 1;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}