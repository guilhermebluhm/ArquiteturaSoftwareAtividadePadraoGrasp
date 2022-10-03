package Service;

import Misc.AreaJogo;
import Misc.TipoArma;
import Model.Mundo;
import Model.Personagem;

public interface AcaoCriarMundo {

    Mundo mundoAtualPersonagemJogador(AreaJogo area);
    String gerarInstanciaJogo(Mundo mundo, Personagem personagem);

}
