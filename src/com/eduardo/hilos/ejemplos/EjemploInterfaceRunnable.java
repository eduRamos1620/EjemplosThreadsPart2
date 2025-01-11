package com.eduardo.hilos.ejemplos;

import com.eduardo.hilos.ejemplos.runnable.ViajeTarea;

public class EjemploInterfaceRunnable {
    public static void main(String[] args) {
        new Thread(new ViajeTarea("DGO")).start();
        new Thread(new ViajeTarea("Barcelona")).start();
        new Thread(new ViajeTarea("Islandia")).start();
        new Thread(new ViajeTarea("Nueva Zelanda")).start();
    }
}
