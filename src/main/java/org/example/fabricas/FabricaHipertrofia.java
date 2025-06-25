package org.example.fabricas;

import org.example.planosExecucao.*;

public class FabricaHipertrofia  implements FabricaAbstrata {

    private FabricaHipertrofia(){}

    private static FabricaHipertrofia instance = new FabricaHipertrofia();
    public static FabricaHipertrofia getInstance() {
        return instance;
    }
    @Override
    public PlanoTreino createPlanoTreino() {
        return new PlanoTreinoHipertorfia();
    }

    @Override
    public PlanoAquecimento createPlanoAquecimento() {
        return new PlanoAquecimentoHipertrofia();
    }

    @Override
    public PlanoRecuperacao createPlanoRecuperacao() {
        return new PlanoRecuperacaoHipertrofia();
    }
}
