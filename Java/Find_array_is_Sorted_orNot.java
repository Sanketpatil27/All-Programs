public class Find_array_is_Sorted_orNot {
    
    public static void main(String r[]) {

        int[] a = {34,56,678,839,2333,6338};
        boolean IsSorted = true;

        for (int i = 0; i < a.length-1; i++) {              // -1 coz its check for i+1
            if (a[i] > a[i+1]) {
                IsSorted = false;
                break;
            }
        }
        if(IsSorted) {
            System.out.println("Your array is sorted");
        }
        else {
            System.out.println("Your array is not sorted!!");
        }
    }
}
