public class Count_Number_Letters_Spaces_In_String {
    public static void main(String[] args) {

        String a = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";

        System.out.println("The String is:  " + a);
        count(a);
    }

    public static void count(String x) {
        char[] test = x.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;

        for (int i = 0; i < test.length; i++) {
            if (Character.isLetter(test[i])) {
                letter++;
            }
            else if (Character.isDigit(test[i])) {
                num++;
            }
            else if (Character.isSpaceChar(test[i])) {
                space++;
            }
            else {
                other++;
            }
        }

        System.out.println("Letters: " + letter);
        System.out.println("Numbers: " + num);
        System.out.println("Spaces: " + space);
        System.out.println("Other: " + other);
    }
}
