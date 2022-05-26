package com.bridglabz.tictactoe;

public class TicTacToe {
    public static void main(String[] args) {
        char[] board = new char[10];
        for (int i = 1; i < board.length; i++) {
            board[i] = '-';
        }
    }
}
