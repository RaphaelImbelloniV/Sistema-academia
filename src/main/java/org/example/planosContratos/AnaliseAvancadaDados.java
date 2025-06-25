package org.example.planosContratos;

public class AnaliseAvancadaDados extends PlanoDecorator {

    public AnaliseAvancadaDados(TipoPlano plano) {
        super(plano);
    }

    public float getValorAdicional() {
        return 20.0f;
    }

    public String getNomeEstrutura() {
        return "Análise de Dados";
    }
}