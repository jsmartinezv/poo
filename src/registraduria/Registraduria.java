/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraduria;
import java.text.DecimalFormat;
/**
 *
 * @author Andruans 
 */
public class Registraduria {

    public static void imprimirTabla(String[][] tabla){
        for (int x=0; x < tabla.length; x++) {
            System.out.print("|"+"\t");
            if (x>0){
            tabla[x][0]="Candidato " + x;
            }
            for (int y=0; y < tabla[x].length; y++) {
                if (y>0){
                    tabla[0][y]="Mpio." + y;
                }
                System.out.print (tabla[x][y]);
                if (y!=tabla[x].length-1){ 
                    System.out.print("\t"+"|"+"\t");
                }
            }
        System.out.println("\t"+ "|");
        }
    }
    public static void totalyPorcentaje(int numeroCandidatos,String[][] tabla){
        double sumf;
        DecimalFormat decimales = new DecimalFormat("0.00");
        DecimalFormat decimales2 = new DecimalFormat("0");
        double arreSumf [] = new double [numeroCandidatos];
         
        for(int b=0;b<tabla.length-1;++b ){
            sumf=0;
            for (int d=0; d < tabla[b].length-1; d++) {
                
                sumf=sumf+Double.parseDouble(tabla[b+1][d+1]);
            }
            arreSumf[b]=sumf; 
        }
        double sumPorcentaje=0;
        for(int j=0;j<arreSumf.length;j++){
            sumPorcentaje=(sumPorcentaje+arreSumf[j]);
        }
        
        double[] porcentaje = new double[numeroCandidatos];
        for(int k=0;k<arreSumf.length;k++){
            
            porcentaje[k]=((arreSumf[k])/sumPorcentaje)*100;    
        }
        String[][] tablaCandidatos = new String[numeroCandidatos+1][3];
        System.out.println();
        
        for (int x=0; x < numeroCandidatos+1; x++) {
            System.out.print("|"+"\t"); 
            tablaCandidatos[0][0]="\t";
            tablaCandidatos[0][1]="Votos";
            tablaCandidatos[0][2]="%";
            if(x>0){
            tablaCandidatos[x][0]="Candidato " + (x);
            tablaCandidatos[x][1]= String.valueOf(decimales2.format(arreSumf[x-1]));
            tablaCandidatos[x][2]= String.valueOf(decimales.format(porcentaje[x-1]));
            }
            for (int y=0; y < 3; y++ ){
                System.out.print(tablaCandidatos[x][y]);
                if (y!=tablaCandidatos[x].length-1){ 
                    System.out.print("\t"+"|"+"\t");
                }
            }
        System.out.println("\t"+ "|");
        }
    }
    
    public static void masVotado(String[][] tabla){
        int sumf;
        DecimalFormat decimales = new DecimalFormat("0");
        int arreSumf [] = new int [tabla.length];
        System.out.println();
        
        for(int b=0;b<tabla.length-1;++b ){
            sumf=0;
            for (int d=0; d < tabla[b].length-1; d++) {
                
                sumf=sumf+Integer.parseInt(tabla[b+1][d+1]);
            }
            arreSumf[b]=sumf; 
        }
        int resultado = arreSumf[0]; 
        for(int i=0; i<arreSumf.length; i++){ 
            if(arreSumf[i] > resultado){ 
                resultado = arreSumf[i];         
            } 
        } 
        System.out.println();
        double mayor = 0; 
        double PrimerValor = 0;
        double SegundoValor =0;
        int QuitaIndice1 = 0;
        int QuitaIndice2 = 0;
        int c = 0; 
        while(c < arreSumf.length) { 
            if( arreSumf[c] > mayor ) { 
                PrimerValor = arreSumf[c]; 
                mayor = PrimerValor;	
                QuitaIndice1 = c; 
            } 
            c++; 
        } 
        c=0; 
        mayor=0; 
        while(c < arreSumf.length) { 
            if ( c != QuitaIndice1 ) { 
                if( arreSumf[c] > mayor ) { 
                    SegundoValor = arreSumf[c]; 
                    mayor = SegundoValor; 
                    QuitaIndice2 = c;	
                } 
            } 
        c++; 
        }
        if(PrimerValor>SegundoValor){
            System.out.println("El candidato mas votado es el candidato: " 
                         + (QuitaIndice1+1)+ " con " + decimales.format(PrimerValor) +" votos");
        }if(PrimerValor==SegundoValor){
            System.out.println("Hay un empate entre los cadidatos " 
                         + (QuitaIndice1+1)+" y "+(QuitaIndice2+1)+ " con " + decimales.format(PrimerValor) +" votos cada uno");
        }
        
    }
    
    public static void ganador(String[][] tabla, int numeroCandidatos){
        double sumf;
        DecimalFormat decimales = new DecimalFormat("0");
        double arreSumf [] = new double [numeroCandidatos];
         
        for(int b=0;b<tabla.length-1;++b ){
            sumf=0;
            for (int d=0; d < tabla[b].length-1; d++) {
                
                sumf=sumf+Double.parseDouble(tabla[b+1][d+1]);
            }
            arreSumf[b]=sumf; 
        }
        double sumPorcentaje=0;
        for(int j=0;j<arreSumf.length;j++){
            sumPorcentaje=(sumPorcentaje+arreSumf[j]);
        }
        
        double[] porcentaje = new double[numeroCandidatos];
        for(int k=0;k<arreSumf.length;k++){
            
            porcentaje[k]=((arreSumf[k])/sumPorcentaje)*100;    
        }
        System.out.println();
        double mayor = 0; 
        double PrimerValor=0;
        double SegundoValor=0;
        int QuitaIndice1 = 0;
        int QuitaIndice2 = 0;
        int c = 0; 
        while(c < porcentaje.length) { 
            if( porcentaje[c] > mayor ) { 
                PrimerValor = porcentaje[c]; 
                mayor = PrimerValor;	
                QuitaIndice1 = c; 
            } 
            c++; 
        } 
        c=0; 
        mayor=0; 
        while(c < porcentaje.length) { 
            if ( c != QuitaIndice1 ) { 
                if( porcentaje[c] > mayor ) { 
                    SegundoValor = porcentaje[c]; 
                    mayor = SegundoValor; 
                    QuitaIndice2 = c;	
                } 
            } 
        c++; 
        } 
        if(PrimerValor>50){
            System.out.println("El ganador es el candidato: "
                    + (QuitaIndice1+1) + " con " + decimales.format(PrimerValor) +" votos");
        }else{
            System.out.println("Los candidatos que se van a segunda vuelta son: "
                    + (QuitaIndice1+1) + " y "+(QuitaIndice2+1)+ " con " 
                    + decimales.format(PrimerValor) + "% y "
                    + decimales.format(SegundoValor) + "% de los votos respectivamente");
        } 
    }
    public static void ordenarCandidatos(String[][] tabla, int numeroCandidatos){
        int sumf;
        int arreSumf [] = new int [numeroCandidatos];
 
        for(int b=0;b<tabla.length-1;++b ){
            sumf=0;
            for (int d=0; d < tabla[b].length-1; d++) {
                
                sumf=sumf+Integer.parseInt(tabla[b+1][d+1]);
            }
            arreSumf[b]=sumf; 
        }
        int aux;
        int[] arreOrdenar=new int[numeroCandidatos];
        
        for(int w=0;w<numeroCandidatos;w++){
            arreOrdenar[w]=arreSumf[w]+1;
        }

        for (int i = 0; i < arreSumf.length - 1; i++) {
            for (int x = i + 1; x < arreSumf.length; x++) {
                if (arreSumf[x] > arreSumf[i]) {
                    aux = arreSumf[i];
                    arreSumf[i] = arreSumf[x];
                    arreSumf[x] = aux;
                }
            }
        }
        
        System.out.println();
        for(int j=0; j<arreSumf.length;j++){  
            for(int k=0;k<arreOrdenar.length;k++){
                if(arreSumf[j]==arreOrdenar[k]-1){
                    System.out.println("Candidato " + (k+1)+": " + arreSumf[j]);
                }
            }
        }
    }
    
    public static void inicio(){
        System.out.println();
        System.out.println("Ahora ingrese el numero que corresponda a la opcio que desee:"+ "\n");
        System.out.println("1. Imprimir una tabla de informacion de los votos \n"
                + "2. Calcular el total y porcentaje de los votos \n" 
                + "3. Mostrar el candidato mas votado o si se presento un empate \n"
                + "4. Indicar el candidato ganador o si deben ir a segunda vuelta \n"
                + "5. Ordenar los candidatos segun el numero de votos \n"
                + "6. Salir de la aplicacion");
        
    }
    
    public static void main (String[] args){
        java.util.Scanner lectura = new java.util.Scanner(System.in);
        String numMunicipios,numCandidatos;
        int numeroMunicipios, numeroCandidatos;
        
        
        System.out.println("Bienvenido al sistema de registro y conteo de votos" 
                +  "\n" + "Por favor ingrese los datos sugeridos" + "\n");
        
        System.out.print("Ingrese el numero de municipios: ");
        numMunicipios=lectura.next();
        System.out.print("Ingrese el numero de cadidatos: ");
        numCandidatos=lectura.next();
        System.out.println();
        
        numeroMunicipios = Integer.parseInt(numMunicipios);
        numeroCandidatos = Integer.parseInt(numCandidatos); 
        String[][] tabla = new String[numeroCandidatos+1][numeroMunicipios+1];
        
        for(int a=0;a<tabla.length-1;++a ){
            for (int c=0; c < tabla[a].length-1; ++c) {
                System.out.print("Numero los votos del candidato " 
                        + (a+1) +" en el municipio " + (c+1) +":");
                tabla[a+1][c+1]=lectura.next();
            }
        }
        tabla[0][0]="\t";
        
        inicio();
        int menu=0;
        
        while(menu!=6){
            switch (menu){
                case 1:imprimirTabla(tabla);
                    break;
                case 2:totalyPorcentaje(numeroCandidatos,tabla);
                    break;
                case 3:masVotado(tabla);
                    break;
                case 4:ganador(tabla,numeroCandidatos);
                    break;
                case 5:ordenarCandidatos(tabla,numeroCandidatos);
                    break;       
            }
            inicio();
            menu=lectura.nextInt();
        }         
    }
    
}
