/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayor2;

/**
 *
 * @author SM
 */
public class Mayor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       java.util.Scanner lectura=
                new java.util.Scanner(System.in);
        int a;
        int b;
        int c;
        int mayor = 0;
        int menor = 0;
        int medio = 0;
        System.out.println("Ingrese a:");
        a=lectura.nextInt();
        System.out.println("Ingrese b:");
        b=lectura.nextInt();
        System.out.println("Ingrese c:");
        c=lectura.nextInt();
        if(a>b && a>c){                                   
            mayor=a;
            if(b>c){
                medio=b;
                menor=c;
            }else{
                medio=c;
                menor=b;
            }   
        }
        
        if(b>a && b>c){
            mayor=b;
            if(a>c){
                medio=a;
                menor=c;
            }else{
                medio=c;
                menor=a;
            }
        }
        if(c>a && c>b){
            mayor=c;
            if(a>b){
                medio=a;
                menor=b;
            }else{
                medio=b;
                menor=a;
            }
        }
        System.out.println("Mayor "+ mayor );
        System.out.println("Mayor "+ medio );
        System.out.println("Mayor "+ menor );
    }
    
}
