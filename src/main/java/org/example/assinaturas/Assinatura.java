package org.example.assinaturas;

//import org.example.planosContratos.Plano;
import org.example.planosContratos.TipoPlano;

import java.util.Observable;

public class Assinatura extends Observable {

    private AssinaturaEstado estado;
//    private TipoPlano plano;

    private float valorTotal;

    public Assinatura(TipoPlano plano) {
        this.estado = AssinaturaEstadoAtiva.getInstance();
        this.valorTotal = plano.getValorPlano();
    }


    public void setEstado(AssinaturaEstado estado) {
        this.estado = estado;
        setChanged();
        notifyObservers();
    }

    public boolean assinaturaEstadoInativa() {
        return estado.assinaturaEstadoInativa(this);
    }

    public boolean assinaturaEstadoAtiva() {
        return estado.assinaturaEstadoAtiva(this);
    }

    public boolean assinaturaEstadoCancelada() {
        return estado.assinaturaEstadoCancelada(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public AssinaturaEstado getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Assinatura{" +
                "Estado=" + estado.getEstado()  + '}';
    }
}
