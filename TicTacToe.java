/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.Scanner;

/**
 *
 * @author corey
 */
public class TicTacToe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        char v1, v2, v3, v4, v5, v6, v7, v8, v9;
        int n;
        v1 = '1';
        v2 = '2';
        v3 = '3';
        v4 = '4';
        v5 = '5';
        v6 = '6';
        v7 = '7';
        v8 = '8';
        v9 = '9';
            //keep initializing...and keyboard = new Scanner(System.in);
        
        //--------- print the board
        printBoard(v1, v2, v3, v4, v5, v6, v7, v8, v9);
        //--------- read X's move
        System.out.print("Player X: enter number (1-9)");
        n = keyboard.nextInt();
        while(!isMoveValid(n, v1, v2, v3, v4, v5, v6, v7, v8, v9)){
            System.out.print("INVALID MOVE. Player X: enter another number (1-9)");
            n = keyboard.nextInt();
        }
        //--------- update the board
        if(n == 1)
            v1 = 'X'; //place an X into the first cell
        if(n == 2)
            v2 = 'X';
        if(n == 3)
            v3 = 'X';
        if(n == 4)
            v4 = 'X';
        if(n == 5)
            v5 = 'X';
        if(n == 6)
            v6 = 'X';
        if(n == 7)
            v7 = 'X';
        if(n == 8)
            v8 = 'X';
        if(n == 9)
            v9 = 'X';
        
        //--------- print the updated board (should have X's move)
        printBoard(v1, v2, v3, v4, v5, v6, v7, v8, v9);
        //--------- read O's move
        System.out.print("Player O: enter number (1-9)");
        n = keyboard.nextInt();
        while(!isMoveValid(n, v1, v2, v3, v4, v5, v6, v7, v8, v9)){
            System.out.print("INVALID MOVE. Player O: enter another number (1-9)");
            n = keyboard.nextInt();
        }
        //--------- update the board
        if(n == 1)
            v1 = 'O'; //place an O into the first cell
        if(n == 2)
            v2 = 'O';
        if(n == 3)
            v3 = 'O';
        if(n == 4)
            v4 = 'O';
        if(n == 5)
            v5 = 'O';
        if(n == 6)
            v6 = 'O';
        if(n == 7)
            v7 = 'O';
        if(n == 8)
            v8 = 'O';
        if(n == 9)
            v9 = 'O';
        //--------- print the updated board (should have O's move)
        printBoard(v1, v2, v3, v4, v5, v6, v7, v8, v9);
    }
    static boolean isMoveValid(int input, char c1, char c2, char c3, 
                                char c4, char c5, char c6, 
                                char c7, char c8, char c9){
        //is the input outside 1-9
        if(input < 1 || input > 9)
            return false;  //the input is not valid
        
        if(input == 1 && c1 != '1')
            return false;
        if(input == 2 && c2 != '2')
            return false;
        if(input == 3 && c3 != '3')
            return false;
        if(input == 4 && c4 != '4')
            return false;
        if(input == 5 && c5 != '5')
            return false;
        if(input == 6 && c6 != '6')
            return false;
        if(input == 7 && c7 != '7')
            return false;
        if(input == 8 && c8 != '8')
            return false;
        if(input == 9 && c9 != '9')
            return false;
        return true;
    }
    static void printBoard(char c1, char c2, char c3,
                        char c4, char c5, char c6, 
                        char c7, char c8, char c9){
    for(int i = 0; i < 40; i++)
        System.out.println(); //clear the old board
    System.out.println(" " + c1 + " | " + c2 + " | " + c3);
    System.out.println("---+---+---");
    System.out.println(" " + c4 + " | " + c5 + " | " + c6);
    System.out.println("---+---+---");
    System.out.println(" " + c7 + " | " + c8 + " | " + c9);
    }
}
