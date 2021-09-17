package com.workshop.tictaktoe;
import java.util.Scanner;
class TicTackToe {
    public static void main(String[] args) {
        char[] board = printBoard();    // creating board here
        char playerIn = selection();    // creating player input
        char compIn;                // creating computer input
        System.out.println("Lets Start The Game, Now..");               // start messege
        // this if else is used for getting right inputs of both players
        if (playerIn == 'X') {
            compIn = 'O';
            System.out.println("computer chooses O ") ;
        } else {
            compIn = 'X';
            System.out.println("computer chooses X ") ;
        }
    }
    public static char selection() {         //selection method is for scanning and returning the players input as a selection for the next move
        Scanner tempVar = new Scanner(System.in);
        char playerIn = tempVar .next().charAt(0); // NOT SURE ABOUT THIS ONE
        return playerIn;
    }
    static char[] printBoard()
    {
        System.out.println("|---|---|---|");
        System.out.println("| " + 1 + " | "
                + 2 + " | " + 3
                + " |");
        System.out.println("|-----------|");
        System.out.println("| " + 4 + " | "
                + 5 + " | " + 6
                + " |");
        System.out.println("|-----------|");
        System.out.println("| " + 7 + " | "
                + 8 + " | " + 9
                + " |");
        System.out.println("|---|---|---|");
        return new char[0];
    }

}
