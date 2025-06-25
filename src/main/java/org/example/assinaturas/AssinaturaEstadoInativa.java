package org.example.assinaturas;

public class AssinaturaEstadoInativa extends AssinaturaEstado {

    private AssinaturaEstadoInativa() {};
    private static AssinaturaEstadoInativa instance = new AssinaturaEstadoInativa();
    public static AssinaturaEstadoInativa getInstance() {return instance;}

    public String getEstado() {return "assinaturaEstadoInativa";}

    public boolean assinaturaEstadoAtiva(Assinatura assinatura) {
        assinatura.setEstado(AssinaturaEstadoAtiva.getInstance());
        return true;
    }

    public boolean assinaturaEstadoCancelada(Assinatura assinatura) {
        assinatura.setEstado(AssinaturaEstadoCancelada.getInstance());
        return true;
    }
}
