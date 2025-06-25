package org.example.fabricas;

import org.example.planosExecucao.*;

public class FabricaEmagrecimento implements FabricaAbstrata {

    private FabricaEmagrecimento(){}

    private static FabricaEmagrecimento instance = new FabricaEmagrecimento();
    public static FabricaEmagrecimento getInstance() {
        return instance;
    }

    @Override
    public PlanoTreino createPlanoTreino() {
        return new PlanoTreinoEmagrecimento();
    }

    @Override
    public PlanoAquecimento createPlanoAquecimento() {
        return new PlanoAquecimentoParaEmagrecimento();
    }

    @Override
    public PlanoRecuperacao createPlanoRecuperacao() {
        return new PlanoRecuperacaoEmagrecimento();
    }
}
