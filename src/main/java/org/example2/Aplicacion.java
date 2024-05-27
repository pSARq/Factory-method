package org.example2;

public abstract class Aplicacion {
    protected abstract Documento crearDocumento();

    public void nuevoDocumento() {
        Documento doc = crearDocumento();
        doc.abrir();
    }

}