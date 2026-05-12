package Poliretos;

import java.util.Scanner;

public class Controlador {

    Scanner sc = new Scanner(System.in);

    public void iniciar() {
        int opcion;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Serie Numerica");
            System.out.println("2. Serie Caracter");
            System.out.println("3. Figuras");
            System.out.println("4. Vocales");
            System.out.println("5. Arrays");
            System.out.println("6. Animacion");
            System.out.println("7. Recursion");
            System.out.println("8. Automata");
            System.out.println("0. Salir");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1: new G1_SerieNumerica().ejecutar(); break;
                case 2: new G1_SerieCaracter().ejecutar(); break;
                case 3: new G1_Figuras().ejecutar(); break;
                case 4: new G1_CadenaDeCaracteres().ejecutar(); break;
                case 5: new G1_Array().ejecutar(); break;
                case 6: new G1_Animaciones().ejecutar(); break;
                case 7: new G1_Recursion().ejecutar(); break;
                case 8: new G1_GrafosYAutomatas().ejecutar(); break;
            }

        } while (opcion != 0);
    }
}