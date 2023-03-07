class Practice_Set_6 {

    public static void main(String[] nfss) {

        // Q1. create an array & calculate their sum

        float[] a = {23.5f,56.7f,57.88f,67.99f,99.56f};
        float sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println("Addition of array = "+ sum);
    }
}