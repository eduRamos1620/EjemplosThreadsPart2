package com.eduardo.hilos.ejemplos;

import com.eduardo.hilos.ejemplos.threads.NombreThread;

public class EjemploExtenderThread {
    public static void main(String[] args) throws InterruptedException {
        Thread hilo = new NombreThread("ISDH");
        hilo.start();
        //Thread.sleep(100);
        Thread hilo2 = new NombreThread("ERR");
        hilo2.start();
        Thread hilo3 = new NombreThread("CRD");
        hilo3.start();
        System.out.println(hilo.getState());
    }
}
