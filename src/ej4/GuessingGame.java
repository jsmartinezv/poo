/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4;

/**
 *
 * @author SM
 */
public class GuessingGame{
    public static void GuessingGame1(){
        java.util.Scanner lectura = new java.util.Scanner(System.in);
        int answer = (int) Math.floor((Math.random()*100)+1);
        int guess=0;
        int numGuesses=1;
        while( numGuesses <= 7 && ( guess!=answer) ){
            System.out.print("Guess a number ");
            guess=lectura.nextInt();
            if(guess<answer){
                System.out.println("Higher...");
            }else{
                if(guess>answer){
                    System.out.println("Lower...");
                }else{
                    System.out.println("You win...");
                }
            }
            numGuesses=numGuesses+1;         
        }
        if(numGuesses>7){
                System.out.println("You loser");
        }               
    }
}
