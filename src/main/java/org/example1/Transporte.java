package org.example1;

/*Esta es la interfaz en comun, la cual contiene diferentes implementaciones con diferentes logicas. En este caso
Entrega por Barco y por Camion. (En un ejemplo mas profundo cada implementacion deberia tener su logica para entregar de
una forma u otra)
* */
public interface Transporte {

    void entregar();

}
