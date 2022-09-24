package Utils;

import Misc.NivelRaridade;
import Misc.TipoArma;
import Model.Arco;
import Model.Arma;
import Model.Machado;

public class GeradorArmaFactory {

    public Arma geradorTipoArma(TipoArma arma){

        switch (arma){
            case ARCO -> {
                return new Arco(1,"arco comum", NivelRaridade.COMUM.toString(),1539.22,false);
            }
            case MACHADO -> {
                return new Machado(1,"machado comum",NivelRaridade.COMUM.toString(),2315.41,false);
            }
            default -> throw new RuntimeException("erro");
        }

    }

}
