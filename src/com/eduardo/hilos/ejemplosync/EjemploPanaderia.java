package com.eduardo.hilos.ejemplosync;

import com.eduardo.hilos.ejemplosync.runnable.Cliente;
import com.eduardo.hilos.ejemplosync.runnable.Panadero;

public class EjemploPanaderia {
    public static void main(String[] args) {
        Panaderia p = new Panaderia();
        new Thread(new Panadero(p)).start();
        new Thread(new Cliente(p)).start();
    }
}
