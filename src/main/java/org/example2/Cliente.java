package org.example2;

public class Cliente {
    public static void main(String[] args) {
        Aplicacion appPDF = new AplicacionPDF();
        appPDF.nuevoDocumento(); // Salida: Abriendo documento PDF.

        Aplicacion appWord = new AplicacionWord();
        appWord.nuevoDocumento(); // Salida: Abriendo documento Word.

        Aplicacion appExcel = new AplicacionExcel();
        appExcel.nuevoDocumento(); // Salida: Abriendo documento Excel.
    }
}