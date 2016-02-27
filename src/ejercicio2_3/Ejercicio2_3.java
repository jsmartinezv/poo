/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_3;

/**
 *
 * @author SM
 */
public class Ejercicio2_3 {

    public static void llegaCarro(String Parqueadero[], int[] HoraLlegada, int QuitaIndice1) {
        java.util.Scanner Lectura = new java.util.Scanner(System.in);
        String PlacaEntra;
        System.out.println();
        System.out.print("Digite la matricula del automovil que entra: ");
        PlacaEntra = Lectura.next();

        for (int k = 0; k < Parqueadero.length; k++) {
            if (Parqueadero[k].equals("O")) {
                Parqueadero[k] = PlacaEntra;
                QuitaIndice1 = k;
                break;
            }
            if (Parqueadero[Parqueadero.length - 1].compareTo("O") > 0) {
                System.out.println("El parqueadero esta full");
            }
        }
        System.out.print("Digite la hora de entrada: ");
        HoraLlegada[QuitaIndice1] = Lectura.nextInt();
        System.out.println();
    }

    public static void sitiosLibres(String[] Parqueadero) {
        int SitiosLibres = 0;
        for (int y = 0; y < Parqueadero.length; y++) {
            if (Parqueadero[y].equals("O")) {
                SitiosLibres++;
            }
        }
        System.out.println();
        System.out.println("La cantidad de puestos libres es: " + SitiosLibres);
        System.out.println();
    }

    public static void imprimirTabla(String[] Parqueadero) {
        System.out.println();
        for (int i = 0; i < Parqueadero.length; i++) {
            System.out.print("|" + "\t" + Parqueadero[i] + "\t");
            if (i == 28 || i == 57) {
                System.out.println("|");
            }//
        }
        System.out.println("|");
        System.out.println();
    }

    public static void inicio() {
        System.out.println("Bienvenido al gestor de parqueadero");
        System.out.println("Ahora ingrese el numero que corresponda a la opcion que necesite:" + "\n");
        System.out.println("1. Registrar la llega de un carro con su hora de llegada \n"
                + "2. Registrar la salida de un auto e indicar el precio a pagar \n"
                + "3. Ver el recaudo del parqueadero en el dia \n"
                + "4. Ver la cantidad de puestos de parqueo libres \n"
                + "5. Mostrar una representacion grafica del estado del parqueadero \n"
                + "6. Salir de la aplicacion");
    }

    public static void main(String[] args) {
        java.util.Scanner Lectura = new java.util.Scanner(System.in);
        String[] Parqueadero = new String[87];
        String PlacaEntra, PlacaSale;
        int ValoraPagar;
        int Tarifa = 1000;
        int QuitaIndice1 = 0;
        int QuitaIndice2 = 0;
        int RecaudoDia = 0;
        int menu = 0;
        int[] HoraLlegada = new int[87];
        int[] HoraSalida = new int[87];

        for (int h = 0; h < Parqueadero.length; h++) {
            Parqueadero[h] = "O";
        }
        while (menu != 6) {
            switch (menu) {
                case 1:
                    llegaCarro(Parqueadero, HoraLlegada, QuitaIndice1);
                    break;

                case 2:
                    System.out.println();
                    System.out.print("Digite la placa del automovil que sale: ");
                    PlacaSale = Lectura.next();

                    for (int j = 0; j < Parqueadero.length; j++) {
                        if (Parqueadero[j].equals(PlacaSale)) {
                            Parqueadero[j] = "O";
                            QuitaIndice2 = j;
                            break;
                        }
                    }

                    System.out.print("Ingrese la hora de salida: ");
                    HoraSalida[QuitaIndice2] = Lectura.nextInt();

                    ValoraPagar = (HoraSalida[QuitaIndice2] - HoraLlegada[QuitaIndice2]) * Tarifa;
                    System.out.println("El valor a pagar es: " + ValoraPagar);
                    RecaudoDia = RecaudoDia + ValoraPagar;
                    System.out.println();
                    break;

                case 3:
                    System.out.println();
                    System.out.println("El recaudo del dia es: " + RecaudoDia);
                    System.out.println();
                    break;

                case 4:
                    sitiosLibres(Parqueadero);
                    break;

                case 5:
                    imprimirTabla(Parqueadero);
            }
            inicio();
            menu = Lectura.nextInt();
        }
    }
}
