package org.example;

import org.example.assinaturas.Assinatura;
import org.example.assinaturas.AssinaturaEstadoAtiva;
import org.example.assinaturas.AssinaturaEstadoCancelada;
import org.example.assinaturas.AssinaturaEstadoInativa;
import org.example.planosContratos.PlanoBasic;
import org.example.planosContratos.TipoPlano;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssinaturaTest {
    Assinatura assinatura;

    @BeforeEach
    public void setUp() {
        assinatura = new Assinatura(new PlanoBasic());
    }


    // Assinatura Ativa

    @Test
    public void naoDeveAtivarClienteAtivo() {
        assinatura.setEstado(AssinaturaEstadoAtiva.getInstance());
        assertFalse(assinatura.assinaturaEstadoAtiva());
    }

    @Test
    public void deveInativarClienteAtivo() {
        assinatura.setEstado(AssinaturaEstadoAtiva.getInstance());
        assertTrue(assinatura.assinaturaEstadoInativa());
        Assertions.assertEquals(AssinaturaEstadoInativa.getInstance(), assinatura.getEstado());
    }

    @Test
    public void deveCancelarClienteAtivo() {
        assinatura.setEstado(AssinaturaEstadoAtiva.getInstance());
        assertTrue(assinatura.assinaturaEstadoCancelada());
        Assertions.assertEquals(AssinaturaEstadoCancelada.getInstance(), assinatura.getEstado());
    }

    // Assinatura Inativa

    @Test
    public void naoDeveInativarClienteInativo() {
        assinatura.setEstado(AssinaturaEstadoInativa.getInstance());
        assertFalse(assinatura.assinaturaEstadoInativa());
    }

    @Test
    public void deveAtivarClienteInativo() {
        assinatura.setEstado(AssinaturaEstadoInativa.getInstance());
        assertTrue(assinatura.assinaturaEstadoAtiva());
        assertEquals(AssinaturaEstadoAtiva.getInstance(), assinatura.getEstado());
    }

    @Test
    public void deveCancelarClienteInativo() {
        assinatura.setEstado(AssinaturaEstadoInativa.getInstance());
        assertTrue(assinatura.assinaturaEstadoCancelada());
        assertEquals(AssinaturaEstadoCancelada.getInstance(), assinatura.getEstado());
    }

    //  Assinatura Cancelada

    @Test
    public void naoDeveCancelarClienteCancelado() {
        assinatura.setEstado(AssinaturaEstadoCancelada.getInstance());
        assertFalse(assinatura.assinaturaEstadoCancelada());
    }

}