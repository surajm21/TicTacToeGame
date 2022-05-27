package com.bridglabz.tictactoe;

import java.util.Scanner;

public class TicTacToe {

        static char determineComputerSymbol ( char playerSymbol){
            char computerSymbol = ' ';
            if (playerSymbol == 'X') {
                computerSymbol = 'O';
            } else if (playerSymbol == 'O') {
                computerSymbol = 'X';
            } else {
                System.err.println("You inserted a wrong Symbol");
            }
            return computerSymbol;
        }

         static char[] createBoard () {
            char[] board = new char[10];
            for (int i = 1; i < board.length; i++) {
                board[i] = '-';
            }
            return board;
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] board = createBoard();
        System.out.println("Enter The Sysmbol which you want i.e. X or O");
        char playerSymbol = scanner.next().charAt(0);
        scanner.close();
        char computerSymbol = determineComputerSymbol(playerSymbol);
    }
}


