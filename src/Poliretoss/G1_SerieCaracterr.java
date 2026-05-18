package Poliretoss;

/*
 * Pedir al usuario un numero entero y imprimir "+" y "-" secuencialmente.
 * Ejm: piden el numero 4 entonces se va a imprimir "+-+-".
 */

import java.util.Scanner;

public class G1_SerieCaracterr {

    public static void ejecutar() {
        new G1_SerieCaracterr().mostrarseriecar();
    }

    public void mostrarseriecar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de terminos a mostrar");
        int term = sc.nextInt();

        int i = 0;
        while (i < term) {
            if (i % 2 == 0) {
                System.out.print("+");
            } else {
                System.out.print("-");
            }
            i++;
        }
        System.out.println();
    }
}

