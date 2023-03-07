public class VarArgs {

//    array type --> int ...
    static int sum(int ... arr){

        int val = 0;
        for (int e: arr) {
            val += e;
        }
        return val;
    }

    public static void main(String[] args) {

        int val  = sum(1,5);

        System.out.println("Addition = "+ val);
        System.out.println("Addition = "+ sum(23,34,34,345));
    }
}
