package Service;

import Misc.TipoClasse;
import Model.Arma;
import Model.Personagem;
import Utils.GeradorArmaFactory;

public interface AcaoCriarPersonagem {

    Personagem geradorPersonagemSolicitadoUsuario(Arma factory);

}
