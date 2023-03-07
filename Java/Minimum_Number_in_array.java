class Minimum_Number_in_array {
    
    public static void main(String[] args) {

        int[] a = {234566,5654477,78978,45463,57865,35257876,678775,435345,56567565};
        int min = 12700000;         // we have to set largest num to min. number 
    
        for (int i = 0; i < a.length; i++) {

            if(a[i] <= min) {
                min = a[i];
            }
        }
        System.out.println("Minimum number in array = "+ min);
    }
}