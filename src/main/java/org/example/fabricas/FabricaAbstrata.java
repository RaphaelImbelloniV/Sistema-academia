package org.example.fabricas;

import org.example.planosExecucao.PlanoAquecimento;
import org.example.planosExecucao.PlanoRecuperacao;
import org.example.planosExecucao.PlanoTreino;

public interface FabricaAbstrata {

    PlanoTreino createPlanoTreino();
    PlanoAquecimento createPlanoAquecimento();
    PlanoRecuperacao createPlanoRecuperacao();
}
