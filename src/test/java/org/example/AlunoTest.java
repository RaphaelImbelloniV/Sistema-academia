package org.example;

import org.example.assinaturas.Assinatura;
import org.example.assinaturas.AssinaturaEstadoAtiva;
import org.example.fabricas.FabricaAbstrata;
import org.example.fabricas.FabricaEmagrecimento;
import org.example.fabricas.FabricaHipertrofia;
import org.example.planosContratos.PlanoBasic;
import org.example.planosContratos.TipoPlano;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveEmitirPlanoTreinoHipertrofia() {
        FabricaAbstrata fabrica = FabricaHipertrofia.getInstance();
        TipoPlano plano = new PlanoBasic();
        Assinatura assinatura = new Assinatura(plano);
        Aluno aluno = new Aluno(fabrica, "Lula da Silva", assinatura);
        assertEquals("Plano de Treino para Hipertrofia", aluno.emitirPlanoTreino());
    }

    @Test
    void deveEmitirPlanoTreinoEmagrecimento() {
        FabricaAbstrata fabrica = FabricaEmagrecimento.getInstance();
        TipoPlano plano = new PlanoBasic();
        Assinatura assinatura = new Assinatura(plano);
        Aluno aluno = new Aluno(fabrica, "Jair Bolsonaro", assinatura);
        assertEquals("Plano de Treino para Emagrecimento", aluno.emitirPlanoTreino());
    }

    @Test
    void deveEmitirPlanoAquecimentoHipertrofia() {
        FabricaAbstrata fabrica = FabricaHipertrofia.getInstance();
        TipoPlano plano = new PlanoBasic();
        Assinatura assinatura = new Assinatura(plano);
        Aluno aluno = new Aluno(fabrica, "Ronaldinho Gaucho",assinatura);
        assertEquals("Plano de Aquecimento para Hipertrofia", aluno.emitirPlanoAquecimento());
    }
    @Test

    void deveEmitirPlanoAquecimentoEmagrecimento() {
        FabricaAbstrata fabrica = FabricaEmagrecimento.getInstance();
        TipoPlano plano = new PlanoBasic();
        Assinatura assinatura = new Assinatura(plano);
        Aluno aluno = new Aluno(fabrica, "Augusto Dalpra",assinatura);
        assertEquals("Plano de Aquecimento para Emagrecimento", aluno.emitirPlanoAquecimento());
    }

    @Test
    void deveEmitirPlanoRecuperacaoHipertrofia() {
        FabricaAbstrata fabrica = FabricaHipertrofia.getInstance();
        TipoPlano plano = new PlanoBasic();
        Assinatura assinatura = new Assinatura(plano);
        Aluno aluno = new Aluno(fabrica, "Fausto Silva",assinatura);
        assertEquals("Plano de Recuperação para Hipertrofia", aluno.emitirPlanoRecuperacao());
    }

    @Test
    void deveEmitirPlanoRecuperacaoEmagrecimento() {
        FabricaAbstrata fabrica = FabricaEmagrecimento.getInstance();
        TipoPlano plano = new PlanoBasic();
        Assinatura assinatura = new Assinatura(plano);
        Aluno aluno = new Aluno(fabrica, "Gugu Liberato",assinatura);
        assertEquals("Plano de Recuperação para Emagrecimento", aluno.emitirPlanoRecuperacao());
    }

    @Test
    void deveRetornarEstadoAssinaturaAtivaAluno() {
        FabricaAbstrata fabrica = FabricaHipertrofia.getInstance();
        TipoPlano plano = new PlanoBasic();
        Assinatura assinatura = new Assinatura(plano);
        Aluno aluno = new Aluno(fabrica, "Chico Anísio",assinatura);

        assertEquals(AssinaturaEstadoAtiva.getInstance(), aluno.getEstadoAssinatura());
    }

//    @Test
//    void deveVerificarValorAssinatura


}