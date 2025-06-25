package org.example.assinaturas;

public class AssinaturaEstadoAtiva extends AssinaturaEstado {

    private AssinaturaEstadoAtiva() {};
    private static AssinaturaEstadoAtiva instance = new AssinaturaEstadoAtiva();
    public static AssinaturaEstadoAtiva getInstance() {return instance;}

    public String getEstado() {return "assinaturaEstadoAtiva";}

    public boolean assinaturaEstadoInativa(Assinatura assinatura) {
        assinatura.setEstado(AssinaturaEstadoInativa.getInstance());
        return true;
    }

    public boolean assinaturaEstadoCancelada(Assinatura assinatura) {
        assinatura.setEstado(AssinaturaEstadoCancelada.getInstance());
        return true;
    }

}
