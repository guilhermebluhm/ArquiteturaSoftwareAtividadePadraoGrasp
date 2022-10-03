package Utils;

import Misc.AreaJogo;
import Misc.NivelDificuldade;
import Model.Mundo;

import java.util.UUID;

public class GeradorAreaMundoFactory {

    UUID gen = UUID.randomUUID();

    public Mundo geradorAreaMundo(AreaJogo area){

        switch(area){
            case PANTANO -> {
                return new Mundo(gen,"pantano da cidade de tristam", NivelDificuldade.NORMAL.toString(),null);
            }
            case CORACAO_DO_PECADO -> {
                return new Mundo(gen,"montanha do fogo ardente", NivelDificuldade.NORMAL.toString(),null);
            }
            case PICO_CELESTIAL -> {
                return new Mundo(gen,"luta com diablo", NivelDificuldade.NORMAL.toString(),null);
            }
            case CONCLAVE_DOS_ESQUECIDOS -> {
                return new Mundo(gen,"luta com o matael - anjo da morte", NivelDificuldade.NORMAL.toString(),null);
            }
            default -> throw new RuntimeException("erro");
        }

    }

}
