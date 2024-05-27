package org.example2;

public class AplicacionPDF extends Aplicacion {
    @Override
    public Documento crearDocumento() {
        return new DocumentoPDF();
    }
}