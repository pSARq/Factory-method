package org.example1;

public class Main {
    public static void main(String[] args) {
        /*Este patron se puede combinar con otros como el strategy para hacer la construccion dinamica del objeto
        * y asi no tener que pasar un valor en especifico al momento de hacer la instanciacion */
        Logistica logisticaTerrestre = new LogisticaTerrestre();
        logisticaTerrestre.planificarEntrega();

        Logistica logisticaMaritima = new LogisticaMaritima();
        logisticaMaritima.planificarEntrega();

    }
}