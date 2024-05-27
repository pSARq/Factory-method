package org.example2;

public class AplicacionExcel extends Aplicacion {
    @Override
    public Documento crearDocumento() {
        return new DocumentoExcel();
    }
}