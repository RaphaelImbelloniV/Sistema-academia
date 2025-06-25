package org.example.planosContratos;

public class PlanoBasic implements TipoPlano {

    public float valorPlano;

    public PlanoBasic() {
    }

    public PlanoBasic(float valorPlano) {
        this.valorPlano = valorPlano;
    }

    public float getValorPlano() {
        return valorPlano;
    }

    public String getEstrutura() {
        return "Plano Basic";
    }
}
