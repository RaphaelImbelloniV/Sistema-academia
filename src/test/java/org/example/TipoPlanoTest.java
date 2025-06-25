package org.example;

import org.example.planosContratos.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TipoPlanoTest {

    @Test
    void deveRetornarValorPlano() {
        TipoPlano plano = new PlanoPremium(1000.0f);
        assertEquals(1000.0f, plano.getValorPlano());
    }

    @Test
    void deveRetornarValorPlanoComRelatorioSaude() {
        TipoPlano plano = new RelatorioSaudePreventiva(new PlanoPremium(1000.0f));
        assertEquals(1010.0f, plano.getValorPlano());
    }

    @Test
    void deveRetornarValorPlanoComAnaliseAvancadaDados() {
        TipoPlano plano = new AnaliseAvancadaDados(new PlanoPremium(1000.0f));
        assertEquals(1020.0f, plano.getValorPlano());
    }

    @Test
    void deveRetornarValorPlanoComRelatorioPerformance() {
        TipoPlano plano = new RelatorioPerformance(new PlanoPremium(1000.0f));
        assertEquals(1005.0f, plano.getValorPlano());
    }

    @Test
    void deveRetornarValorPlanoComSaudeMaisAnalise() {
        TipoPlano plano = new RelatorioSaudePreventiva(new AnaliseAvancadaDados(new PlanoPremium(1000.0f)));
        assertEquals(1030.0f, plano.getValorPlano()); // 1000 + 20 + 10
    }

    @Test
    void deveRetornarValorPlanoComSaudeMaisPerformance() {
        TipoPlano plano = new RelatorioSaudePreventiva(new RelatorioPerformance(new PlanoPremium(1000.0f)));
        assertEquals(1015.0f, plano.getValorPlano()); // 1000 + 5 + 10
    }

    @Test
    void deveRetornarValorPlanoComAnaliseMaisPerformance() {
        TipoPlano plano = new AnaliseAvancadaDados(new RelatorioPerformance(new PlanoPremium(1000.0f)));
        assertEquals(1025.0f, plano.getValorPlano()); // 1000 + 5 + 20
    }

    @Test
    void deveRetornarValorPlanoCompleto() {
        TipoPlano plano = new RelatorioSaudePreventiva(new AnaliseAvancadaDados(new RelatorioPerformance(new PlanoPremium(1000.0f))));
        assertEquals(1035.0f, plano.getValorPlano()); // 1000 + 5 + 20 + 10
    }

    @Test
    void deveRetornarEstruturaPlano() {
        TipoPlano plano = new PlanoPremium();
        assertEquals("Plano Premium", plano.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPlanoComSaude() {
        TipoPlano plano = new RelatorioSaudePreventiva(new PlanoPremium());
        assertEquals("Plano Premium/Relatório Saúde", plano.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPlanoComAnalise() {
        TipoPlano plano = new AnaliseAvancadaDados(new PlanoPremium());
        assertEquals("Plano Premium/Análise de Dados", plano.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPlanoComPerformance() {
        TipoPlano plano = new RelatorioPerformance(new PlanoPremium());
        assertEquals("Plano Premium/Relatório Performance", plano.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPlanoComSaudeMaisAnalise() {
        TipoPlano plano = new RelatorioSaudePreventiva(new AnaliseAvancadaDados(new PlanoPremium()));
        assertEquals("Plano Premium/Análise de Dados/Relatório Saúde", plano.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPlanoComSaudeMaisPerformance() {
        TipoPlano plano = new RelatorioSaudePreventiva(new RelatorioPerformance(new PlanoPremium()));
        assertEquals("Plano Premium/Relatório Performance/Relatório Saúde", plano.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPlanoComAnaliseMaisPerformance() {
        TipoPlano plano = new AnaliseAvancadaDados(new RelatorioPerformance(new PlanoPremium()));
        assertEquals("Plano Premium/Relatório Performance/Análise de Dados", plano.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPlanoCompleto() {
        TipoPlano plano = new RelatorioSaudePreventiva(new AnaliseAvancadaDados(new RelatorioPerformance(new PlanoPremium())));
        assertEquals("Plano Premium/Relatório Performance/Análise de Dados/Relatório Saúde", plano.getEstrutura());
    }
}