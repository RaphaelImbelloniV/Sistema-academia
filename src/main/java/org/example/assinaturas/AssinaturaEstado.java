package org.example.assinaturas;

public abstract class AssinaturaEstado {

    public abstract String getEstado();

    public boolean assinaturaEstadoInativa(Assinatura assinatura) {return false;}

    public boolean assinaturaEstadoAtiva(Assinatura assinatura) {return false;}

    public boolean assinaturaEstadoCancelada(Assinatura assinatura) {return false;}
}
