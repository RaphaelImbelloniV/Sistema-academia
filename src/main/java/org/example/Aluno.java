package org.example;

import org.example.assinaturas.Assinatura;
import org.example.assinaturas.AssinaturaEstado;
import org.example.fabricas.FabricaAbstrata;
import org.example.planosExecucao.PlanoAquecimento;
import org.example.planosExecucao.PlanoRecuperacao;
import org.example.planosExecucao.PlanoTreino;

import java.util.Observable;
import java.util.Observer;

public class Aluno implements Observer {


    private String nome;
    private Assinatura assinatura;
    private String ultimaNotificacao;
    private PlanoTreino planoTreino;
    private PlanoAquecimento planoAquecimento;
    private PlanoRecuperacao planoRecuperacao;

    public Aluno (FabricaAbstrata fabrica, String nome, Assinatura assinatura) {
        this.nome = nome;
        this.assinatura = assinatura;
        this.planoTreino = fabrica.createPlanoTreino();
        this.planoAquecimento = fabrica.createPlanoAquecimento();
        this.planoRecuperacao = fabrica.createPlanoRecuperacao();
    }

    public String emitirPlanoTreino() {
        return this.planoTreino.emitir();
    }

    public String emitirPlanoAquecimento() {
        return this.planoAquecimento.emitir();
    }

    public String emitirPlanoRecuperacao() {
        return this.planoRecuperacao.emitir();
    }

    public AssinaturaEstado getEstadoAssinatura() {
        return this.assinatura.getEstado();
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void assinar(Assinatura assinatura) {
        assinatura.addObserver(this);
    }

    @Override
    public void update(Observable assinatura, Object arg) {
        this.ultimaNotificacao = this.nome + " - Estado da assinatura: " + assinatura.toString();
    }
}
