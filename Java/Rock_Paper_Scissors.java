//   -->  (int) (Math.random() * (max - min + 1) + min) can be replaced with --> random.nextInt(1,4) for easiness
//        System.out.println((Math.random()));    // For call random number
//        System.out.println((int)(Math.random()));    // For integer random number
//        System.out.println((int)(Math.random()*(max-min+1)+min));  // For int random no. between min and max value

import java.util.Random;
//import java.lang.Math;  for math.random
import java.util.*;

public class Rock_Paper_Scissors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nStarting the game.......... \n=========Stone Paper Scissors==========");
        System.out.println("Rules -->  \n\tRock beats Scissors \n\tPaper beats Rock \n\tScissors beats Paper");
        //int min = 1;   // used for math.random
        //int max = 3;
        int i = 1;
        int win = 0;
        int lose = 0;
        int totalRounds = 5;

        Random random = new Random();                  // random generator till 3
        //int computer = random.nextInt(1,4);       // generate 0 to 2 numbers  or 1 to 3

        System.out.println("\nPlayer 1.You  &  Player 2.Computer \nThere are total " + totalRounds + " Rounds if you won in most of time then you will become Winner");
        System.out.println("Wrong choice will late you lose  the round");
        System.out.println("Enter Any 1 Number  \n1.For Rock \n2.For Paper \n3.For Scissors");

        while (i <= totalRounds) {
            System.out.print("\nEnter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    if (random.nextInt(1, 4) == 2) {
//                    if ((int) (Math.random() * (max - min + 1) + min) == 2) {
                        System.out.println("You Chose Rock, computer chose Paper,  You Lose!");
                        lose++;
                    } else if (random.nextInt(1, 4) == 3) {
                        System.out.println("You Chose Rock, Computer chose Scissors, You Win");
                        win++;
                    } else {
                        System.out.println("You Chose Rock, Computer chose Rock Game Tie");
                    }
                    break;

                case 2:
                    if (random.nextInt(1, 4) == 1) {
                        System.out.println("You chose Paper, computer chose Rock,  You Win");
                        win++;
                    } else if (random.nextInt(1, 4) == 3) {
                        System.out.println("You chose Paper, Computer chose Scissors, You Lose");
                        lose++;
                    } else {
                        System.out.println("You Chose Paper, Computer chose Paper, Game Tie");
                    }
                    break;

                case 3:
                    if (random.nextInt(1, 4) == 1) {
                        System.out.println("You chose Scissors, computer chose Rock,  You Lose");
                        lose++;
                    }
                    else if (random.nextInt(1, 4) == 2) {
                        System.out.println("You chose Scissors, Computer chose Paper, You Win");
                        win++;
                    }
                    else {
                        System.out.println("You chose Scissors, Computer chose Scissors, Game Tie");
                    }
                    break;

                default:
                    System.out.println("Wrong choice!!!");
                    lose++;
            }
            i++;
        }
        if (win > lose) {
            System.out.println("\nYou win " + win + " Times in out of " + totalRounds + " Rounds \nCongratulations You Won The game");
        }
        else if (win == lose) {
            System.out.println("\nYou and computer both are wins " + win + " Times, Game is Tie");
        }
        else {
            System.out.println("\nYou Lose " + lose + " Rounds, You Lose The Game!! \nBetter Luck Next Time!!!");
        }
    }
}
