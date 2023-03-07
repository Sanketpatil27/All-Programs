import java.util.Random;
import java.util.Scanner;

public class NumGuess {
   static Scanner sc = new Scanner(System.in);
   static int guess, flag = 0, numOfGuesses = 0, num;

    public NumGuess() {
        Random r = new Random();
        guess = r.nextInt(0,100);  //  0  to (bound - 1)
    }

    static int takeUserInput() {
        System.out.print("Enter a number btn 0 to 100 to guess it's correct or not: ");
        num = sc.nextInt();
        return num;
    }

    static void isCorrectNumber() {
        while (flag != 1) {
            if (guess == takeUserInput()) {
                System.out.println("Correct");
                numOfGuesses++;
                flag = 1;
            }
            else if (guess > num) {
                System.out.println("The number you have chosen is Less to correct");
                numOfGuesses++;
            }
            else if (guess < num) {
                System.out.println("The number you have chosen is Large to correct");
                numOfGuesses++;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("\n\t\t\t\t  || GUESS THE NUMBER || \n");

        NumGuess obj = new NumGuess();

        isCorrectNumber();
        System.out.println("You Guess the correct number After taking Total number of guesses:  " + numOfGuesses);
    }
}
