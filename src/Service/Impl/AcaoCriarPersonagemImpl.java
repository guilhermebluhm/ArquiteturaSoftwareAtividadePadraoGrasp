package Service.Impl;

import Misc.TipoClasse;
import Model.Arma;
import Model.Personagem;
import Service.AcaoCriarPersonagem;

import java.util.UUID;

public class AcaoCriarPersonagemImpl implements AcaoCriarPersonagem {

    private UUID getUUID = UUID.randomUUID();

    @Override
    public Personagem geradorPersonagemSolicitadoUsuario(Arma factory) {

        return new Personagem(getUUID,"Assembly",1500.00,TipoClasse.BARBARO,factory);

    }
}
