/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avion;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author SM
 */
public class Avion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner lectura = new java.util.Scanner(System.in);
        int filaEjec=2;
        int filaEcon=7;
        int columnaEjec=4;
        int columnaEcon=6;
        int asiento=0;
        int matrizEjec[][]=new int[filaEjec][columnaEjec];
        matrizEjec=creaMatriz(filaEjec, columnaEjec);
        String matrizEjecNom[][]=new String[filaEjec][columnaEjec];
        matrizEjecNom=creaMatrizChar(filaEjec, columnaEjec);
        int matrizEcon[][]=new int[filaEcon][columnaEcon];
        matrizEcon=creaMatriz(filaEcon, columnaEcon);
        int menu1=0;
        int salir=1;
        while(salir == 1){
            //main_principal
            System.out.println("----------------------BIENVENIDO----------------");
            System.out.println("---Como es su nombre:...........----------------");
            String nombre=lectura.nextLine();
            System.out.println("---Como es su Cedula:...........----------------");
            int cedula=lectura.nextInt();
            System.out.println("---Escoja una categoria de su preferencia: .....");
            System.out.println("---1) Ejecutivo: .....");
            System.out.println("---2) Comercial: .....");
            System.out.println("---3) Numero de puestos libres en ejecutivo:....");
            System.out.println("---4) Numero de puestos libres en economico:....");
            System.out.println("---5) Mapa de reservas (1=ocupado)(0=libre):....");
            
            menu1=lectura.nextInt();
            switch(menu1){
                case 1:
                    //main1
                    System.out.println("------------------------------------------------");
                    System.out.println("--------------CLASE EJECUTIVA-------------------");
                    System.out.println("------------------------------------------------");
                    System.out.println("---Elija el asiento donde quiere ubicarse: .....");
                    System.out.println("---1) Ventana: .....");
                    System.out.println("---2) Pasillo: .....");
                    int lugar = lectura.nextInt();
                    asignarLugar(matrizEjec,lugar,nombre,cedula);
                    //asignarLugarChar(matrizEjecNom,lugar,nombre,cedula);
                    //escribeMatriz(matrizEjec);
                    //escribeMatrizChar(matrizEjecNom);
                    System.out.println("Va a reservar otro puesto: SI:1 NO:0");
                    salir=lectura.nextInt();
                    break;
                case 2:
                    //main2
                    System.out.println("------------------------------------------------");
                    System.out.println("--------------CLASE COMERCIAL-------------------");
                    System.out.println("------------------------------------------------");
                    System.out.println("---Elija el asiento donde quiere ubicarse: .....");
                    System.out.println("---1) Ventana: .....");
                    System.out.println("---2) Centro:  ......");
                    System.out.println("---3) Pasillo: .....");
                    int lugar1 = lectura.nextInt();
                    asignarLugarEc(matrizEcon,lugar1,nombre,cedula);
                    //escribeMatriz(matrizEcon);
                    System.out.println("Va a reservar otro puesto: SI:1 NO:0");
                    salir=lectura.nextInt();
                    break;
                case 3:
                    int cont = contador(matrizEjec);
                    System.out.println("el numero de puestos libres es " + cont);
                    break;
                case 4:
                    int cont1 = contador(matrizEcon);
                    System.out.println("el numero de puestos libres es " + cont1);
                    break;
                case 5:
                   
                    escribeMatriz(matrizEjec);
                    escribeMatriz(matrizEcon);
                    break;
                default:
                    System.out.println("---------------VALOR NO RECONOCIDO---------------");
                    break;
            }
        }
    }
    public static int[][] asignarLugar(int mat[][], int lugar, String nombre, int cedula){
        java.util.Scanner lectura = new java.util.Scanner(System.in);
        int matriz[][]=mat;
        switch (lugar){
            case 1: //En caso de que escoja ventana  
                for(int i=0;i<matriz.length;i++){
                    for(int j=0;j<matriz[i].length;j+=3){
                        if(matriz[i][j]==0){
                            matriz[i][j]=1;
                            System.out.println("lugar asignado: ");
                            System.out.print("fila " + (i+1));
                            System.out.print(" Columna " + (j+1));
                            return matriz;//, matrizNombre, matrizCedula;
                        }else ;//continue;
                    }
                }
                break;
            case 2://En caso de que escoja pasillo
                for(int i=0;i<matriz.length;i++){
                    for(int j=1;j<matriz[i].length-1;j++){
                        if(matriz[i][j]==0){
                            matriz[i][j]=1;
                            System.out.println("lugar asignado: ");
                            System.out.print("fila " + (i+1));
                            System.out.print(" Columna " + (j+1));
                            System.out.println();
                            return matriz;
                        }else;
                    }
                }
                break;
        }
    return matriz;
    }
    public static String[][] asignarLugarChar(String mat[][], int lugar, String nombre, int cedula){
        java.util.Scanner lectura = new java.util.Scanner(System.in);
        String matriz[][]=mat;
        switch (lugar){
            case 1: //En caso de que escoja ventana  
                for(int i=0;i<matriz.length;i++){
                    for(int j=0;j<matriz[i].length;j+=3){
                        if(matriz[i][j]==" "){
                            matriz[i][j]=nombre;
                            System.out.println("lugar asignado: ");
                            System.out.print("fila " + (i+1));
                            System.out.print(" Columna " + (j+1));
                            return matriz;//, matrizNombre, matrizCedula;
                        }else ;//continue;
                    }
                }
                break;
            case 2://En caso de que escoja pasillo
                for(int i=0;i<matriz.length;i++){
                    for(int j=1;j<matriz[i].length-1;j++){
                        if(matriz[i][j]==" "){
                            matriz[i][j]=nombre;
                            System.out.println("lugar asignado: ");
                            System.out.print("fila " + (i+1));
                            System.out.print(" Columna " + (j+1));
                            System.out.println();
                            return matriz;
                        }else;
                    }
                }
                break;
        }
    return matriz;
    }
    public static int[][] creaMatriz(int fila, int columna){
        int matriz[][]=new int[fila][columna];
        for(int i=0;i<fila;i++)
            for(int j=0;j<columna;j++)
                matriz[i][j]=0;
        return matriz;
    }
    public static String[][] creaMatrizChar(int fila, int columna){
        String matriz[][]=new String[fila][columna];
        for(int i=0;i<fila;i++)
            for(int j=0;j<columna;j++)
                matriz[i][j]="0";
        return matriz;
    }
     
    public static int[][] escribeMatriz(int mat[][]){
        //int matriz[][]=mat;
        for (int i=0;i<mat.length;i++){
            System.out.println();
            for(int j=0;j<mat[i].length;j++){
                System.out.print(" " + mat[i][j]+ " ");
            }
        }
        System.out.println();
        return mat;
    }
    public static String[][] escribeMatrizChar(String mat[][]){
        //int matriz[][]=mat;
        for (int i=0;i<mat.length;i++){
            System.out.println();
            for(int j=0;j<mat[i].length;j++){
                System.out.print(" " + mat[i][j]+ " ");
            }
        }
        System.out.println();
        return mat;
    }
    public static int[][] asignarLugarEc(int mat[][], int lugar, String nombre, int cedula){
        java.util.Scanner lectura = new java.util.Scanner(System.in);
        int matriz[][]=mat;
        switch (lugar){
            case 1: //En caso de que escoja ventana  
                for(int i=0;i<matriz.length;i++){
                    for(int j=0;j<matriz[i].length;j+=5){
                        if(matriz[i][j]==0){
                            matriz[i][j]=1;
                            System.out.println("lugar asignado: ");
                            System.out.print("fila " + (i+1));
                            System.out.print(" Columna " + (j+1));
                            return matriz;//, matrizNombre, matrizCedula;
                        }else ;//continue;
                    }
                }
                break;
            case 2://En caso de que escoja centro
                for(int i=0;i<matriz.length;i++){
                    for(int j=1;j<matriz[i].length-1;j+=3){
                        if(matriz[i][j]==0){
                            matriz[i][j]=1;
                            System.out.println("lugar asignado: ");
                            System.out.print("fila " + (i+1));
                            System.out.print(" Columna " + (j+1));
                            System.out.println();
                            return matriz;
                        }else;
                    }
                }
                break;
            case 3://En caso de que escoja pasillo
                for(int i=0;i<matriz.length;i++){
                    for(int j=2;j<matriz[i].length-2;j++){
                        if(matriz[i][j]==0){
                            matriz[i][j]=1;
                            System.out.println("lugar asignado: ");
                            System.out.print("fila " + (i+1));
                            System.out.print(" Columna " + (j+1));
                            System.out.println();
                            return matriz;
                        }else;
                    }
                }
                break;
        }
    return matriz;
    }
    public static int contador (int matriz[][]){
        int contador=0;
        for(int i=0;i<matriz.length;i++){
                    for(int j=0;j<matriz[i].length;j++){
                        if(matriz[i][j]==0){
                            contador = contador + 1 ;                            
                        }else;
                    }
        }
        return contador;
    }
}
