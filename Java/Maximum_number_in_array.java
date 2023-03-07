class Maximum_number_in_array {

    public static void main(String[] akl) {

        int[] a = { 23, 657647564, 678, 8977897, 34545,345354};
        int max = -12700000;        // we have to set smallest element to max to find max in array 

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= max) {
                max = a[i];
            }
        }
        System.out.println("Max value in array = "+ max);
    }
}