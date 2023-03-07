public class String_Methods {

    public static void main(String[] args) {
                    
        String name = "BiLLionaire";    //From index 0 1 2 3

        System.out.println("\nName = "+ name);
        System.out.println("Length of name = " + name.length());
        System.out.println("Lower case = " + name.toLowerCase());   // convert to lower case  
        System.out.println("Upper case = " + name.toUpperCase());   // convert to Upper case

        String str = "   Iron     man    ";
        String length = str.trim();
        System.out.println("\nLength of new string include space = " + str +" =length = "+ str.length());
        System.out.println("After Removing all Leading & Trailing spaces = " + str.trim() + " = Length: " + length.length());

        System.out.println("\nAfter starting from index 3: "+ name.substring(3));
        System.out.println("After giving starting & ending index: "+ name.substring(3,8));

        String pet = "Harry";
        System.out.println("\nAfter replacing characters: "+ pet.replace("rry","p"));   // for multi character we have to incl. ""

        System.out.println("Starts with: "+pet.startsWith("Ha"));  // returns boolean true or false
        System.out.println("Ends with: "+ pet.endsWith("rr"));

        
    }
}