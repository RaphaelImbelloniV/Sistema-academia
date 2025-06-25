package org.example.planosContratos;

public class RelatorioSaudePreventiva extends PlanoDecorator {

    public RelatorioSaudePreventiva(TipoPlano plano) {
        super(plano);
    }

    public float getValorAdicional() {
        return 10.0f;
    }

    public String getNomeEstrutura() {
        return "Relatório Saúde";
    }
}
