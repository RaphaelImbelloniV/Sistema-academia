package org.example.planosContratos;

public class PlanoStandard implements TipoPlano {

    public float valorPlano;

    public PlanoStandard() {
    }

    public PlanoStandard(float valorPlano) {
        this.valorPlano = valorPlano;
    }

    public float getValorPlano() {
        return valorPlano;
    }

    public String getEstrutura() {
        return "Plano Standard";
    }
}