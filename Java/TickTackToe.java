import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class TickTackToe {

    static ArrayList<Integer> PlayerPositions = new ArrayList<Integer> ();
    static ArrayList<Integer> CpuPositions = new ArrayList<Integer> ();


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        
//        char[][] gameBoard = new char[5][5];
        char[][] gameBoard = {
                {' ', '|', ' ', '|', ' '},
                {'-', '-', '-', '-', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '-', '-', '-', '-'},
                {' ', '|', ' ', '|', ' '},
        };
        System.out.println();
        printGameBoard(gameBoard);

        while (true) {
            System.out.print("\nEnter your placement (1-9): ");
            int PlayerPos = sc.nextInt();
            System.out.println();

            while (PlayerPositions.contains(PlayerPos) || CpuPositions.contains(PlayerPos)) {
                System.out.println("Position Taken! Enter correct Position... : ");
                PlayerPos = sc.nextInt();
            }

            placePiece(gameBoard, PlayerPos,"Player");
            System.out.println();

            String result = checkWinner();

            if (result.length() > 0) {
                System.out.println(result);
                break;
            }

            int CpuPos = ran.nextInt(1,10);

            while (PlayerPositions.contains(CpuPos) || CpuPositions.contains(CpuPos)) {
                // System.out.println("Position Taken! Enter correct Position...");  // doesn't need for computer
                CpuPos = ran.nextInt(1,10);
            }

            System.out.println("Computer Move: " + CpuPos);
            System.out.println();
            placePiece(gameBoard, CpuPos,"CPU");

            result = checkWinner();

            if (result.length() > 0) {
                System.out.println(result);
                break;
            }
        }
    }

    static void printGameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    static void placePiece(char[][] gameBoard,int pos, String user) {
        int flag  = 0;
        char symbol = ' ';

        if (user.equals("Player")) {
            symbol = 'X';
            PlayerPositions.add(pos);
        }
        else {
            symbol = 'O';
            CpuPositions.add(pos);
        }

        switch (pos) {
            case 1 -> gameBoard[0][0] = symbol;
            case 2 -> gameBoard[0][2] = symbol;
            case 3 -> gameBoard[0][4] = symbol;
            case 4 -> gameBoard[2][0] = symbol;
            case 5 -> gameBoard[2][2] = symbol;
            case 6 -> gameBoard[2][4] = symbol;
            case 7 -> gameBoard[4][0] = symbol;
            case 8 -> gameBoard[4][2] = symbol;
            case 9 -> gameBoard[4][4] = symbol;
            default -> {
                flag = 1;
                System.out.println("You can choose only 0 - 9 numbers, try again!!!");
            }
        }
        if (flag != 1) {
            printGameBoard(gameBoard);
        }
    }

    static String checkWinner() {
        List TopRow = Arrays.asList(1,2,3);
        List midRow = Arrays.asList(4,5,6);
        List botRow = Arrays.asList(7,8,9);
        List leftCol = Arrays.asList(1,4,7);
        List midCol = Arrays.asList(2,5,8);
        List rightCol = Arrays.asList(3,6,9);
        List cross1 = Arrays.asList(1,5,9);
        List cross2 = Arrays.asList(3,5,7);

        List<List> winningConditions = new ArrayList<List>();
        winningConditions.add(TopRow);
        winningConditions.add(midRow);
        winningConditions.add(botRow);
        winningConditions.add(leftCol);
        winningConditions.add(midCol);
        winningConditions.add(rightCol);
        winningConditions.add(cross1);
        winningConditions.add(cross2);

        for (List l: winningConditions) {
            if (PlayerPositions.containsAll(l)) {
                return "\nCongratulations you Won! \n";
            }
            else if (CpuPositions.containsAll(l)) {
                return "\nSorry You Lost!! :( \n";
            }
        }
        if (PlayerPositions.size() + CpuPositions.size() == 9) {
            return "\nCAT!!! \n";
        }

        return "";
    }
}