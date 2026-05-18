package Poliretoss;

public class controlador { 
// Archivo por compatibilidad (NO se usa en el programa principal).
// Se deja como clase no pública para evitar conflictos con Controlador.java.
    public static void main(String[] args) {
        // Delegar al controlador real
        Poliretoss.controlador ctrl = new Poliretoss.controlador();
        ctrl.iniciar();
    }

    
}

