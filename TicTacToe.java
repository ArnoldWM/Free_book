package com.company;/*
work in progres
*/
import java.sql.SQLOutput;
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
            PeiceHolder(Board, PiecePosition, "YOU",false);
            Random rand = new Random();
            int Computerposition = rand.nextInt(9) + 1;
            if (PiecePosition == Computerposition){
                Computerposition = rand.nextInt(9) +1;
            }
            PeiceHolder(Board, Computerposition, "Computer",false);
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

    public static void PeiceHolder(char[][] Board, int PiecePosition, String player, Boolean win) {
        char symbol = 'X';
        if (player.equals("Player")) {
            symbol = 'X';
        } else if (player.equals("Computer")) {
            symbol = 'O';
        }
        if (Board[0][0]  == symbol && Board[0][2] == symbol && Board[0][4] == symbol || // horizontally
                Board[1][0]  == symbol && Board[2][2] == symbol && Board[3][4] == symbol || // horizontally
                Board[2][0]  == symbol && Board[2][2] == symbol && Board[2][4] == symbol || // horizontally
                Board[0][2]  == symbol && Board[1][2] == symbol && Board[2][2] == symbol || // middle
                Board[0][0]  == symbol && Board[1][2] == symbol && Board[2][4] == symbol || //  Left down
                Board[0][4]  == symbol && Board[1][2] == symbol && Board[2][2] == symbol // right down

        ){
            System.out.println("Player Won");
            win = true;
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

