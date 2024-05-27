package org.example2;

public class AplicacionWord extends Aplicacion {
    @Override
    public Documento crearDocumento() {
        return new DocumentoWord();
    }
}