package org.example.planosContratos;

public abstract class PlanoDecorator implements TipoPlano {

    private TipoPlano plano;
    public String estrutura;

    public PlanoDecorator(TipoPlano plano) {
        this.plano = plano;
    }

    public TipoPlano getPlano() {
        return plano;
    }

    public void setPlano(TipoPlano plano) {
        this.plano = plano;
    }

    public abstract float getValorAdicional();

    public float getValorPlano() {
        return this.plano.getValorPlano() + this.getValorAdicional();
    }

    public abstract String getNomeEstrutura();

    public String getEstrutura() {
        return this.plano.getEstrutura() + "/" + this.getNomeEstrutura();
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }
}