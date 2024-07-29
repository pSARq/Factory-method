package org.example3;

public class PDFDocument implements Document {
    @Override
    public void open() {
        System.out.println("Abriendo documento PDF.");
    }
}