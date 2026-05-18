package Poliretoss;

/*
 * Crear una array para cada palabra de su nombre e ingresar el porcentaje de carga para cada palabra.
 * Ejemplo: Pancracia Carmeliana Altamirano Perez
 * Ingrese el porcentaje de carga: 100 75 50 25
 *
 * Mostrar barra de carga por palabra.
 */

import java.util.Scanner;

public class G1_Arrayss {

    public static void ejecutar() {
        new G1_Arrayss().cargaPorPalabras();
    }

    private void cargaPorPalabras() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre completo (separado por espacios): ");
        String nombre = sc.nextLine().trim();
        if (nombre.isEmpty()) {
            System.out.println("Nombre vacío.");
            return;
        }

        String[] palabras = nombre.split("\\s+");
        int n = palabras.length;
        int[] porcentajes = new int[n];

        System.out.println("Ingrese el porcentaje de carga para cada palabra (" + n + " valores). ");
        for (int i = 0; i < n; i++) {
            System.out.print(palabras[i] + ": ");
            porcentajes[i] = sc.nextInt();
        }

        // consumo del salto de línea
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            int p = Math.max(0, Math.min(100, porcentajes[i]));
            int ancho = 16; // tamaño de la barra
            int filled = (int) Math.round((p / 100.0) * ancho);

            StringBuilder bar = new StringBuilder();
            for (int k = 0; k < ancho; k++) {
                bar.append(k < filled ? '=' : ' ');
            }

            System.out.println("[" + bar + "] " + p + "%  " + palabras[i]);
        }
    }
}

