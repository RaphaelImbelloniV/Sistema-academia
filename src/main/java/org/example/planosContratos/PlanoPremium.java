package org.example.planosContratos;

public class PlanoPremium implements TipoPlano {

    public float valorPlano;

    public PlanoPremium() {
    }

    public PlanoPremium(float valorPlano) {
        this.valorPlano = valorPlano;
    }

    @Override
    public float getValorPlano() {
        return valorPlano;
    }

    @Override
    public String getEstrutura() {
        return "Plano Premium";
    }
}