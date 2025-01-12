package com.eduardo.hilos.ejemplos;

import com.eduardo.hilos.ejemplos.runnable.ImprimirFrases;

public class EjemploSincronizacionThread {
    public static void main(String[] args) throws InterruptedException {
        new Thread(new ImprimirFrases("Hola ", "Como estas")).start();
        new Thread(new ImprimirFrases("quien eres ", "tu")).start();
        Thread.sleep(100);
        Thread h3 = new Thread(new ImprimirFrases("Buenos ", "dias"));
        h3.start();

    }

    public synchronized static void imprimirFrases(String frase1, String frase2){
        System.out.print(frase1);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(frase2);
    }
}
