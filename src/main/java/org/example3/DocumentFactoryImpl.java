package org.example3;

import java.util.HashMap;

/*Proveedor dinámico de Documentos a través de un diccionario*/
public class DocumentFactoryImpl implements DocumentFactory {

    private final HashMap<String, Document> applicationHashMap = new HashMap<>();

    public DocumentFactoryImpl() {
        this.applicationHashMap.put("word", new WordDocument());
        this.applicationHashMap.put("excel", new ExcelDocument());
        this.applicationHashMap.put("pdf", new PDFDocument());
    }

    @Override
    public Document getDocumentApplication(String documentType) {
        return applicationHashMap.get(documentType);
    }
}
