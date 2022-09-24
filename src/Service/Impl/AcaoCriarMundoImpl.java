package Service.Impl;

import Misc.AreaJogo;
import Model.Mundo;
import Service.AcaoCriarMundo;
import Utils.GeradorAreaMundoFactory;

public class AcaoCriarMundoImpl implements AcaoCriarMundo {

    GeradorAreaMundoFactory gen = new GeradorAreaMundoFactory();

    @Override
    public Mundo mundoAtualPersonagemJogador(AreaJogo area) {

        return gen.geradorAreaMundo(area);

    }
}
