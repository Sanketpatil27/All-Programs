import java.util.Scanner;
import java.util.Vector;

class Library {

    Scanner sc = new Scanner(System.in);
    Vector<String> al = new Vector<String>();

    int i = 0, issue;
    String returned;

    Library() {
        al.add("Think And Grow Rich");
        al.add("The One Thing");
        al.add("You Can You Will");
        al.add("Power of Habit");
    }

    void addBook() {

        System.out.print("How many books you want to add: ");
        int numOfBook = sc.nextInt();
        sc.nextLine();       // required after nextInt method, for like next line, double

        System.out.print("Enter the name of books Which you want to add: ");

        while (i < numOfBook) {
            al.add(sc.nextLine());
            i++;
        }
        System.out.println(numOfBook + " Books Added to Library...");
    }

    void issueBook() {

        if (returned == null) {
            System.out.print("");
        }
        else {
            System.out.print(returnBook());
        }

        showAvailableBooks();

        System.out.print("Enter Number of book which you want to issue: ");
        issue = sc.nextInt() - 1;           // to match the index to position

        returned = al.get(issue);
        al.removeElementAt(issue);
        System.out.println(returned + " Book Issued...");
        System.out.println("If you want to issue another book, you have to return last book first...");
    }

    String returnBook() {
        System.out.println(returned + ", Book Returned to the Library...");
        al.add(returned);
        returned = null;
        return "";
    }

    void showAvailableBooks() {
        System.out.println("Available Books are:  " + al);
    }
}

public class LibraryImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library l = new Library();

        while (true) {

            System.out.println("\nEnter your choice \n1.Show Available Books \n2.Add Books \n3.Issue Book  \n4.Return Book \n5.Exit");
            int ch = sc.nextInt();
            int flag = 0;

            switch (ch) {
                case 1 -> l.showAvailableBooks();
                case 2 -> l.addBook();
                case 3 -> l.issueBook();
                case 4 -> l.returnBook();
                case 5 -> flag = 1;
                default -> System.out.println("Wrong choice!!!");
            }

            if (flag == 1) {
                break;
            }
        }
    }
}
