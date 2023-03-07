package Folder.folder1.folder2;    
// <package_Name>. <Sub_Folder_Name>. <Sub_Folder_Name>    
// creates sub folder after . operator

class Calculator {
    public void calculate(int a, int b) {
        System.out.println("Your result is: "+ (a+b));
    }
}

class ScientificCalculator {
    public void calculate(int a, int b) {
        System.out.println("Your result is: "+ Math.sin(a+b));
    }
}

class HybridCalculator {
    public void calculate(int a, int b) {
        System.out.println("Your result is: "+ (a+b));
        System.out.println("Your result is: "+ Math.cos(a+b));
    }
}

public class Packages {

    public int proInt = 12;   // for checking protected can accesse in subclass  (in packages_To_Access_Protected calss)
    int defInt = 34;  // for checking defalt cant accessed in subclass


    public static void main(String[] args) {

        Calculator c = new Calculator();
        HybridCalculator h = new HybridCalculator();
        ScientificCalculator sc = new ScientificCalculator();

        c.calculate(456,56);
        sc.calculate(23,45);
        h.calculate(1,3);
    }
}