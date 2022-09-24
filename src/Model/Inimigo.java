package Model;

import Misc.TipoMonstro;

import java.util.UUID;

public class Inimigo {

    private UUID idInimigoSessao;
    private TipoMonstro monstro;
    private Double vida;
    private Double danoBase;

    public Inimigo(){

    }

    public Inimigo(UUID idInimigoSessao, TipoMonstro monstro, Double vida, Double danoBase) {
        this.idInimigoSessao = idInimigoSessao;
        this.monstro = monstro;
        this.vida = vida;
        this.danoBase = danoBase;
    }

    public UUID getIdInimigoSessao() {
        return idInimigoSessao;
    }

    public void setIdInimigoSessao(UUID idInimigoSessao) {
        this.idInimigoSessao = idInimigoSessao;
    }

    public TipoMonstro getMonstro() {
        return monstro;
    }

    public void setMonstro(TipoMonstro monstro) {
        this.monstro = monstro;
    }

    public Double getVida() {
        return vida;
    }

    public void setVida(Double vida) {
        this.vida = vida;
    }

    public Double getDanoBase() {
        return danoBase;
    }

    public void setDanoBase(Double danoBase) {
        this.danoBase = danoBase;
    }
}
