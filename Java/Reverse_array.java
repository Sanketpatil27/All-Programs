class Reverse_array {

    public static void main(String[] kdnkd) {

        int[] a = {34,566,78,45,76,7887,90,35};

        for (int i = a.length - 1; i >= 0; i--) {           // length-1 coz a.len = 5 & array = n-1 
            System.out.print(a[i] + " ");
        }
    }
}