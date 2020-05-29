/*
work in progres


*/
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    /*
  _|


     */

    public static void main(String[] args) {
        char[][] Board = {{'_', '|', '_', '|', '_'},
                {'_', '|', '_', '|', '_'},
                {' ', '|', ' ', '|', ' '}};
        printBoard(Board);
        while (true) {
            Scanner In = new Scanner(System.in);
            System.out.println("enter your position(from 1 - 9):");
            int PiecePosition = In.nextInt();
            PeiceHolder(Board, PiecePosition, "YOU");
            Random rand = new Random();
            int Computerposition = rand.nextInt(9) + 1;
            PeiceHolder(Board, PiecePosition, "Computer");
            printBoard(Board);
        }
    }

    public static void printBoard(char[][] Board) {
        for (char[] rows : Board) {
            for (char c : rows) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void PeiceHolder(char[][] Board, int PiecePosition, String player) {
        char symbol = 'X';
        if (player.equals("Player")) {
            symbol = 'X';
        } else if (player.equals("Computer")) {
            symbol = ' ';
        }

        switch (PiecePosition) {
            case 1:
                Board[0][0] = symbol;
                break;
            case 2:
                Board[0][2] = symbol;
                break;
            case 3:
                Board[0][4] = symbol;
                break;
            case 4:
                Board[1][0] = symbol;
                break;
            case 5:
                Board[1][2] = symbol;
                break;
            case 6:
                Board[1][4] = symbol;
                break;
            case 7:
                Board[2][0] = symbol;
                break;
            case 8:
                Board[2][2] = symbol;
                break;
            case 9:
                Board[2][4] = symbol;
                break;
            default:
                break;
        }
    }
}

