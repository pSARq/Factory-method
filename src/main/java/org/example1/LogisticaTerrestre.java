package org.example1;

/*Esta ya es mi clase creadora especifica que utiliza a la clase abtracta*/
public class LogisticaTerrestre extends Logistica {
    @Override
    protected Transporte crearTransporte() {
        return new Camion();
    }
}
