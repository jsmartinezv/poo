/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

/**
 *
 * @author SM
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Primera Funcion en main");
        Funcion1 f1 = new Funcion1();
        String pantalla = f1.getFunc1();
        System.out.println(pantalla);
        Funcion2 f2 = new Funcion2();
        String pantalla2 = f2.getFunc2();
        System.out.println(pantalla2);
    }
}
