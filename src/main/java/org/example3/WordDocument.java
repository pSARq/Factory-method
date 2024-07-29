package org.example3;

public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Abriendo documento Word.");
    }
}