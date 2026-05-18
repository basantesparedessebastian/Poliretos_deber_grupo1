package Poliretoss;

/*
 * Crear un método recursivo para obtener factorial(n)
 */

import java.util.Scanner;

public class G1_Recursion {

    public static void ejecutar() {
        new G1_Recursion().factorialRec();
    }

    private void factorialRec() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese n para calcular factorial(n): ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("n debe ser >= 0");
            return;
        }

        long fact = factorial(n);
        System.out.println("factorial(" + n + ") = " + fact);
    }

    private long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
}

