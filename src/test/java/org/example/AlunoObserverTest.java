package org.example;

import org.example.assinaturas.Assinatura;
import org.example.assinaturas.AssinaturaEstadoAtiva;
import org.example.assinaturas.AssinaturaEstadoCancelada;
import org.example.assinaturas.AssinaturaEstadoInativa;
import org.example.fabricas.FabricaHipertrofia;
import org.example.planosContratos.PlanoBasic;
import org.example.planosContratos.TipoPlano;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoObserverTest {

    @Test
    void deveNotificarAlunoAposAlterarParaInativa() {
        TipoPlano plano = new PlanoBasic();
        Assinatura assinatura = new Assinatura(plano);
        Aluno aluno = new Aluno(FabricaHipertrofia.getInstance(), "Donald Trump",assinatura);
        aluno.assinar(assinatura);
        assinatura.setEstado(AssinaturaEstadoInativa.getInstance());
        assertEquals("Donald Trump - Estado da assinatura: Assinatura{Estado=assinaturaEstadoInativa}", aluno.getUltimaNotificacao());
    }

    @Test
    void deveNotificarAlunoAposAssinaturaCancelada() {
        TipoPlano plano = new PlanoBasic();
        Assinatura assinatura = new Assinatura(plano);
        Aluno aluno = new Aluno(FabricaHipertrofia.getInstance(), "Donald Trump",assinatura);
        aluno.assinar(assinatura);
        assinatura.setEstado(AssinaturaEstadoCancelada.getInstance());
        assertEquals("Donald Trump - Estado da assinatura: Assinatura{Estado=assinaturaEstadoCancelada}", aluno.getUltimaNotificacao());
    }

    @Test
    void deveNotificarAlunoQuandoTrocaDeInativaParaAtiva() {
        TipoPlano plano = new PlanoBasic();
        Assinatura assinatura = new Assinatura(plano);
        Aluno aluno = new Aluno(FabricaHipertrofia.getInstance(), "Donald Trump",assinatura);
        aluno.assinar(assinatura);
        assinatura.setEstado(AssinaturaEstadoInativa.getInstance());
        assinatura.setEstado(AssinaturaEstadoAtiva.getInstance());
        assertEquals("Donald Trump - Estado da assinatura: Assinatura{Estado=assinaturaEstadoAtiva}", aluno.getUltimaNotificacao());
    }

    @Test
    void naoDeveAlterarEstadoDeCanceladaParaAtiva() {
        TipoPlano plano = new PlanoBasic();
        Assinatura assinatura = new Assinatura(plano);
        Aluno aluno = new Aluno(FabricaHipertrofia.getInstance(), "Donald Trump",assinatura);
        aluno.assinar(assinatura);
        assinatura.setEstado(AssinaturaEstadoCancelada.getInstance());
        assinatura.setEstado(AssinaturaEstadoAtiva.getInstance());
        assertEquals("Donald Trump - Estado da assinatura: Assinatura{Estado=assinaturaEstadoAtiva}", aluno.getUltimaNotificacao());
        // mantem a ultima notificação (assinatura ativa, pois não ha como ir de cancelado para ativo, logo não tem nova notificação)
    }



}