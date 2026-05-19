package Poliretoss;

/*
 * Autómatas para validar: a*b+c
 * Expresión regular: a* b+ c
 * Ejemplos válidos: "bc", "abbc", "abbbc", "aaabbbbbc"
 */

import java.util.Scanner;

public class G1_GrafosyAutomatas {

    public static void ejecutar() {
        new G1_GrafosyAutomatas().validar();
    }

    private void validar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una cadena (solo a, b, c) sin espacios entre ellas: ");
        String s = sc.nextLine().trim();

        boolean ok = s.matches("a*b+c");
        System.out.println(ok ? "Cadena VÁLIDA (a*b+c)" : "Cadena INVÁLIDA (a*b+c)");
    }
}

