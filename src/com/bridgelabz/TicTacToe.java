package com.bridgelabz;

import java.util.Scanner;

public class TicTacToe {
    static String[] board;
    static void printBoard(){
        System.out.println("|----|----|----|");
        System.out.println("|" + board[0] + "|" + board[1] + "|" + board[2] + "|");
        System.out.println("|--------------|");
        System.out.println("|" + board[3] + "|" + board[4] + "|" + board[5] + "|");
        System.out.println("|--------------|");
        System.out.println("|" + board[6] + "|" + board[7] + "|" + board[8] + "|");
        System.out.println("|----|----|----|");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        board=new String[9];
        System.out.println("Welcome to Tic Tac Toe game");
        printBoard();
    }
}
