package Poliretoss;

/*
 * Graficar la siguiente figura (ejemplo):
 *  | _ 
 *    | _ _ 
 *      | _ _ _ 
 *        | _ _ _ _ 
 *
 */

import java.util.Scanner;

public class G1_Figurass {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese numero de filas: ");
        int filas = sc.nextInt();
        figuras(filas);
    }

    public static void figuras(int filas) {
        for (int i = 1; i <= filas; i++) {
            System.out.print("| ");
            for (int j = 1; j <= i; j++) {
                System.out.print("_ ");
            }
            System.out.println();
        }
    }
}

