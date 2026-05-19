package Poliretoss;

/*
 * Graficar la siguiente figura :
 *  | _ 
 *     | _ _ 
 *          | _ _ _ 
 *                 | _ _ _ _ 
 * 
 */

import java.util.Scanner;

public class G1_Figurass {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese numero de escalones: ");
        int escalones = sc.nextInt();
        figuras(escalones);
    }

    public static void figuras(int escalones) {
        int espacios = 1;
        for (int i = 1; i <= escalones; i++) {
            for (int j = 1; j < espacios; j++) {
                System.out.print("  ");
            }
            System.out.print("| ");
            for (int j = 1; j <= i; j++) {
                System.out.print("_ ");
            }
            System.out.println();
            espacios = espacios + (2 * (i + 1));
        }  
    }
    
}


