package org.example1;

public class Camion implements Transporte {
    @Override
    public void entregar() {
        System.out.println("Entrega por camion");
    }
}
