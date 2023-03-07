import java.io.*;

class buffer_class {

    public static void main(String[] atfd) throws Exception {

        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));

        int a, b, c;

        System.out.println("Enter Two numbers: ");
        a = Integer.parseInt(x.readLine());
        b = Integer.parseInt(x.readLine());

        c = a + b;
        System.out.println("Addition = "+ c);
    }
}