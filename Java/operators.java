public class operators {

    public static void main(String[] args) {

        int i = 34;
        int b = i++;
        int j = 99;

        System.out.println(b); // First display then increament
        System.out.println("i = " + ++i); // First display then increament
        System.out.println(i);
        System.out.println(++j + i); // First intcrement then Display
        System.out.println(j);

        // ------------------------character increament---------------------
        char c = 'a';
        System.out.println(c++);
        System.out.println(++c);
        System.out.println(--c);

        char f = 'd';
        char e = (char) (f + 9);   // result will be d  + number
        System.out.println(e);
        System.out.println((char)(c + 3));   // result come after increment and decrement of c ='a'
    }
}