package org.example.planosContratos;

public class RelatorioPerformance extends PlanoDecorator {

    public RelatorioPerformance(TipoPlano plano) {
        super(plano);
    }

    public float getValorAdicional() {
        return 5.0f;
    }

    public String getNomeEstrutura() {
        return "Relatório Performance";
    }
}