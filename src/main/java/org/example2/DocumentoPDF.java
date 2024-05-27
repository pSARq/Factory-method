package org.example2;

public class DocumentoPDF implements Documento {
    @Override
    public void abrir() {
        System.out.println("Abriendo documento PDF.");
    }
}