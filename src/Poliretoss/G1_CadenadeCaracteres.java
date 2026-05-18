package Poliretoss;

/*
 * Pedir una frase y contar las vocales.
 * Ejemplo: frase: "ballena" -> salida: tiene 3 vocales.
 */

import java.util.Scanner;

public class G1_CadenadeCaracteres {

    public static void ejecutar() {
        new G1_CadenadeCaracteres().contarVocales();
    }

    private void contarVocales() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();

        int vocales = 0;
        for (int i = 0; i < frase.length(); i++) {
            char c = Character.toLowerCase(frase.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vocales++;
            }
        }

        System.out.println("La frase tiene " + vocales + " vocal(es). ");
    }
}

