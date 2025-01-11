package com.eduardo.hilos.ejemplos;

import com.eduardo.hilos.ejemplos.runnable.ViajeTarea;

public class EjemploInterfaceRunnableJava8 {
    public static void main(String[] args) {
        Runnable viaje = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " - " + Thread.currentThread().getName());
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Finalmente me voy de viaje a " + Thread.currentThread().getName());
        };

        new Thread(viaje, "DGO").start();
        new Thread(viaje, "Barcelona").start();
        new Thread(viaje, "Islandia").start();
        new Thread(viaje, "Nueva Zelanda").start();
    }
}
