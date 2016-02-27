/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author SM
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner lectura=
                new java.util.Scanner(System.in);
        
        //a=lectura.nextInt();//por si se va a leer desde consola
        int contador=1;
        int cuenta_as=1;
        int blan=1;
        int num=5;
        char esp=' ', ast='*';
        while(contador <= num){
            blan = num - contador;
            while(blan > 0){
                System.out.print(esp);
                blan=blan-1;
            }
            cuenta_as=1;
            while(cuenta_as < (2*contador)){
                System.out.print(ast);
                cuenta_as=cuenta_as+1;
            }
            contador=contador+1;
            System.out.println("|");
        }
              
        
        // TODO code application logic here
    }
    
}
