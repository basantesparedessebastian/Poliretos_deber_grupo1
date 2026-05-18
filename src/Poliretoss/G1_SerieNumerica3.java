package Poliretoss;

// Realizar una serie que imprima 3, 9, 27, 81, 243, 729, 2187, ...
// y que pida al usuario el número de términos a mostrar

import java.util.Scanner;

public class G1_SerieNumerica3 {

    public static void ejecutar() {
        new G1_SerieNumerica3().mostrarserienum();
    }

    public void mostrarserienum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero de terminos a mostrar: ");
        int n = sc.nextInt();

        int valor = 3;
        for (int i = 1; i <= n; i++) {
            System.out.print(valor + " ");
            valor *= 3;
        }
        System.out.println();
    }
}

