package org.example3;

public class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Abriendo documento Excel.");
    }
}