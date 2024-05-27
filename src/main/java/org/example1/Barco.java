package org.example1;

public class Barco implements Transporte {
    @Override
    public void entregar() {
        System.out.println("Entrega por Barco");
    }
}
