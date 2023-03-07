public class literals {

    public static void main(String[] args)
    {
	    byte age = 34;
        int age2 = 89;
        short age3 = 98;
        long age4 = 9899888876l;
        char ch = 'a';
        double age5 = 98998888767878D;
        float f = 0.67f;  // default decimal is double
        boolean a = true;  // default is false
        String str = "im billionair";

        System.out.println(age);
        System.out.println(age2);
        System.out.println(age3);
        System.out.println(age4);
        System.out.println(age5);
        System.out.println(ch);
        System.out.println(f);
        System.out.println(str);
        System.out.println(ch+2);
        System.out.println(age + ch);
        System.out.println(age + 'a');
    }
}
