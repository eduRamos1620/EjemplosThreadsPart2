package com.eduardo.hilos.ejemplosync;

import com.eduardo.hilos.ejemplosync.runnable.Cliente;
import com.eduardo.hilos.ejemplosync.runnable.Panadero;

import java.util.concurrent.ThreadLocalRandom;

public class EjemploPanaderiaConJava8 {
    public static void main(String[] args) {
        Panaderia p = new Panaderia();
        new Thread(() -> {
            for (int i=0; i<10; i++){
                p.hornear("pan num: " + i);
                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        new Thread(() -> {
            for (int i=0; i<10; i++){
                p.consumir();
            }
        }).start();
    }
}
