package org.example3;

public class Client {
    public static void main(String[] args) {
        /*El mismo ejemplo anterior pero con la diferencia de que ahora no se usa herencia para crear los diferentes
        * tipos de documentos. Ademas de que en este caso la clase Client ya se libra de toda responsabilidad de
        * crear los objetos de tipo diccionario y esa responsabilidad pasa a ser de DocumentFactoryImpl, la ventaja de esto
        * es que por ejemplo si necesito que alguna clase que implemente la interfaz Document necesita por alguna razón
        * llamar a otra interfaz para realizar una tarea, evito tener que inyectar la interfaz desde esta clase. Ademas
        * de que para que Document reciba la interfaz que necesita hay que pasarla por varias clases (Esta, la clase que crea
        * el documento especifico que se necesita y por ultimo a la implementación concreta que es quien la va a usar).
        * Todo esto suponiendo que la interfaz que necesita usar la implementacion concreta no necesita variar en tiempo de ejecución,
        *  sino que desde antes ya se reconoce exactamente que valor es el que necesita.
        *
        * Otra ventaja es que como ya no hay que inyectar las interfaces desde aquí, entonces en caso de que la implementación
        * se vea afectada y requiera de una nueva interfaz o por el contrario, que ya no se use una. Simplemente se modifica la implementación
        * y esta clase no debería verse afectada en su comportamiento ni tampoco en los test unitarios, los cuales probablemente
        * si se tendrían que modificar si se hace con herencia
        *
        * Otra ventaja es que es menos código (clases). Es verdad que a medida que crezcan la cantidad de implementaciones de la interfaz
        * va a crecer el diccionario de DocumentFactoryImpl, pero al menos la logica de creación esta centrada en un solo punto
        * siendo mas fácil de localizar
        *
        * Este ejemplo no se si cumpla con el patron factory method, pero definitivamente es una fabrica dinámica que permite
        * construir un objeto especifico sin que esta clase se vea afectada
        * */

        DocumentFactory documentFactory = new DocumentFactoryImpl();

        Document appPDF = documentFactory.getDocumentApplication("pdf");
        appPDF.open();

        Document appWord = documentFactory.getDocumentApplication("word");
        appWord.open();

        Document appExcel = documentFactory.getDocumentApplication("excel");
        appExcel.open();
    }
}