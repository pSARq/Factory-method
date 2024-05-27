package org.example1;

/*Esta es mi clase constructura abstracta, es quien crea la clase que necesite, pero para eso
* se debe de crear clases que extiendan de esta para poderla usar*/
public abstract class Logistica {

    protected abstract Transporte crearTransporte();

    public void planificarEntrega() {
        /*Aquí puedo agregar logica en común que tenga que tener en cuenta para la creacion de todas las diferentes
        implementaciones de la interfaz Transporte.
        En este caso no hay mas logica
        * */
        Transporte transporte = crearTransporte();
        transporte.entregar();
    }

}
