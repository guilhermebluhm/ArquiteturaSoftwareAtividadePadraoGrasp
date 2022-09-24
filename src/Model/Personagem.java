package Model;

import Misc.TipoClasse;

import java.util.UUID;

public class Personagem {

    private UUID idPersonagemSessao;
    private String nomePersonagem;
    private Double danoBase;
    private TipoClasse tipoClasse_escolhida;
    private Arma arma;

    public Personagem(){

    }

    public Personagem(UUID idPersonagemSessao, String nomePersonagem, Double danoBase, TipoClasse tipoClasse_escolhida, Arma tipoArma) {
        this.idPersonagemSessao = idPersonagemSessao;
        this.nomePersonagem = nomePersonagem;
        this.danoBase = danoBase;
        this.tipoClasse_escolhida = tipoClasse_escolhida;
        this.arma = tipoArma;
    }

    public UUID getIdPersonagemSessao() {
        return idPersonagemSessao;
    }

    public void setIdPersonagemSessao(UUID idPersonagemSessao) {
        this.idPersonagemSessao = idPersonagemSessao;
    }

    public String getNomePersonagem() {
        return nomePersonagem;
    }

    public void setNomePersonagem(String nomePersonagem) {
        this.nomePersonagem = nomePersonagem;
    }

    public Double getDanoBase() {
        return danoBase;
    }

    public void setDanoBase(Double danoBase) {
        this.danoBase = danoBase;
    }

    public TipoClasse getClasse_escolhida() {
        return tipoClasse_escolhida;
    }

    public void setClasse_escolhida(TipoClasse tipoClasse_escolhida) {
        this.tipoClasse_escolhida = tipoClasse_escolhida;
    }

    public Arma getTipoArma() {
        return arma;
    }

    public void setTipoArma(Arma tipoArma) {
        this.arma = tipoArma;
    }
}
