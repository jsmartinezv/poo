/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4;

import static ej4.GuessingGame.GuessingGame1;

/**
 *
 * @author SM
 */
public class Ej4 {
    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        java.util.Scanner lectura = new java.util.Scanner(System.in);
        int playAgain = 1;
        while(playAgain == 1){
            GuessingGame1();
            System.out.print("Would you like to play again? (1 yes/ 2 no): ");
            playAgain=lectura.nextInt();
        }
        System.out.println("Good bye");
    }
        // TODO code application logic here
}

