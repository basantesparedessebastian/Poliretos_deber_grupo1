package Poliretoss;

import java.util.Random;

public class G1_Animacioness {

    public static void ejecutar() {
        new G1_Animacioness().simularDescarga();
    }

    private void simularDescarga() {
        Random rnd = new Random();
        int total = rnd.nextInt(91) + 10; // 10..100

        int descargado = 0;
        int ancho = 30;

        // Colores ANSI (normalmente funcionan en consola si está habilitado)
        String verde = "\u001B[32m";
        String rojo = "\u001B[31m";
        String reset = "\u001B[0m";

        System.out.println("Descargando (" + total + " kB) ...");
        while (descargado < total) {
            // avanza de 1 a 4
            descargado += rnd.nextInt(4) + 1;
            if (descargado > total) descargado = total;

            int percent = (int) Math.round((descargado * 100.0) / total);
            int filled = (int) Math.round((descargado * 1.0) / total * ancho);

            StringBuilder barra = new StringBuilder();
            for (int i = 0; i < ancho; i++) {
                barra.append(i < filled ? '=' : ' ');
            }

            String color = percent < 50 ? verde : rojo;
            System.out.print("\r" + color + "[" + barra + "]" + reset + " " + percent + "% "
                    + descargado + " / " + total + " kB");

            try {
                Thread.sleep(80);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
        System.out.println();
        System.out.println("Descarga completada.");
    }
}

