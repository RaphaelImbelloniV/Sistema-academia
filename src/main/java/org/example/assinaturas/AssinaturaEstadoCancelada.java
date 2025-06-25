package org.example.assinaturas;

public class AssinaturaEstadoCancelada extends AssinaturaEstado {

    private AssinaturaEstadoCancelada() {};
    private static AssinaturaEstadoCancelada instance = new AssinaturaEstadoCancelada();
    public static AssinaturaEstadoCancelada getInstance() {return instance;}

    public String getEstado() {return "assinaturaEstadoCancelada";}
}
