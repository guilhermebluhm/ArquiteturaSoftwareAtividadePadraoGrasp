package EntryPoint;

import Misc.AreaJogo;
import Misc.TipoArma;
import Misc.TipoMonstro;
import Model.Arma;
import Model.Inimigo;
import Model.Mundo;
import Model.Personagem;
import Service.Impl.AcaoCriarMundoImpl;
import Service.Impl.AcaoCriarPersonagemImpl;
import Utils.GeradorArmaFactory;

import java.util.UUID;

public class Program {

    public static void main(String[] args) {

        UUID idUnicoMonstro = UUID.randomUUID();

        GeradorArmaFactory gen = new GeradorArmaFactory();
        Arma arma = gen.geradorTipoArma(TipoArma.MACHADO);

        AcaoCriarPersonagemImpl impl = new AcaoCriarPersonagemImpl();
        AcaoCriarMundoImpl impl_mundo = new AcaoCriarMundoImpl();

        Personagem personagem = impl.geradorPersonagemSolicitadoUsuario(arma);
        Mundo mundo = impl_mundo.mundoAtualPersonagemJogador(AreaJogo.PANTANO);

        System.out.println(personagem.getNomePersonagem());
        System.out.println(mundo.getDescricaoNivel());

        Inimigo inimigo_pantano = new Inimigo(idUnicoMonstro, TipoMonstro.DIABRETE,500.00,100.00);
        mundo.setInimigo(inimigo_pantano);

        System.out.println(mundo.getInimigo().getMonstro());
    }

}
