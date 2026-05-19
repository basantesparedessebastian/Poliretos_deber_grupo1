package Poliretoss;

// Controlador.java — menú principal y enrutamiento

import java.util.Scanner;

public class controlador {

    private final Scanner sc = new Scanner(System.in);

    public void iniciar() {
        int opcion;

        do {
            mostrarMenu();
            opcion = leerOpcion();
            ejecutarOpcion(opcion);
        } while (opcion != 0);

        System.out.println("¡Hasta luego!");
    }

    private void mostrarMenu() {
        System.out.println("\n╔══════════════════════════════╗");
        System.out.println("║     MENÚ DE EJERCICIOS SEBAS ║");
        System.out.println("╠══════════════════════════════╣");
        System.out.println("║ 1. Serie Numérica (3,9,27…)  ║");
        System.out.println("║ 2. Serie Carácter (+-+-)     ║");
        System.out.println("║ 3. Figuras  | _ _ |          ║");
        System.out.println("║ 4. Contar Vocales            ║");
        System.out.println("║ 5. Arrays + Barra %          ║");
        System.out.println("║ 6. Animación Descarga        ║");
        System.out.println("║ 7. Factorial Recursivo       ║");
        System.out.println("║ 8. Autómata que valida a*b+c ║");
        System.out.println("║ 0. Salir                     ║");
        System.out.println("╚══════════════════════════════╝");
        System.out.print("Seleccione: ");
    }

    private int leerOpcion() {
        try {
            return Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;  // opción inválida
        }
    }

    private void ejecutarOpcion(int opcion) {
        System.out.println();
        try {
            switch (opcion) {
                case 1: G1_SerieNumerica3.ejecutar();    break;
                case 2: G1_SerieCaracterr.ejecutar();    break;
                case 3: G1_Figurass.ejecutar();           break;
                case 4: G1_CadenadeCaracteres.ejecutar(); break;
                case 5: G1_Arrayss.ejecutar();            break;
                case 6: G1_Animacioness.ejecutar();      break;
                case 7: G1_Recursion.ejecutar();        break;
                case 8: G1_GrafosyAutomatas.ejecutar();          break;
                case 0: break;  // salir
                default:
                    System.out.println("⚠ Opción inválida.");
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

