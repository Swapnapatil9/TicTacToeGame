package com.bridgelabz;

import java.util.Scanner;

public class TicTacToe {
uc1_create_board
    static char[] board= new char[10];
uc2_choose_symbol
    static char[] board= new char[10];
    static char playerSymbol;
    static char computerSymbol;
master
    static void createBoard(){
        for(int i = 1;i < board.length;i++){
            board[i] = ' ';
        }
        System.out.println("board is created");
    }
    uc1_create_board
    public static void main(String[] args) {
        createBoard();

    static void assignSymbol(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Choose your letter X or O");
        playerSymbol=scanner.next().charAt(0);
        if(playerSymbol=='X'|| playerSymbol=='x'){
            computerSymbol='O';
        } else if (playerSymbol=='O' || playerSymbol=='o') {
            computerSymbol='X';
        }else {
            System.out.println("Invalid input");
            assignSymbol();
        }
   master
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        board=new String[9];
        System.out.println("Welcome to Tic Tac Toe game");
uc2_choose_symbol
        createBoard();
        assignSymbol();
 master
 master
    }
}
