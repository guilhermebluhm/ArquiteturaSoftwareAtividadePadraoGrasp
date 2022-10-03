package Service.Impl;

import Misc.AreaJogo;
import Model.Mundo;
import Model.Personagem;
import Service.AcaoCriarMundo;
import Utils.GeradorAreaMundoFactory;

public class AcaoCriarMundoImpl implements AcaoCriarMundo {

    GeradorAreaMundoFactory gen = new GeradorAreaMundoFactory();

    @Override
    public Mundo mundoAtualPersonagemJogador(AreaJogo area) {

        return gen.geradorAreaMundo(area);

    }

    @Override
    public String gerarInstanciaJogo(Mundo mundo, Personagem personagem) {

        StringBuilder sb = new StringBuilder();

        sb.append("\n");
        sb.append("lore inicial do jogo"+"\n");
        sb.append("neste fim de mundo desgracado, nojento e violento"+"\n");
        sb.append("chega nosso heroi " + personagem.getNomePersonagem() + " que pertence ao cla dos " + personagem.getClasse_escolhida()+"(S)"+"\n");
        sb.append("e avista sua primeira missao nesta regiao pois ve " + mundo.getInimigo().getMonstro()+"\n");
        sb.append("entao devemos sacar nosso(a) " + personagem.getTipoArma().getDescricao()+"\n");
        sb.append("e assim comeca nossa jornada em busca do anjo decaido"+"\n");

        return sb.toString();
    }
}
