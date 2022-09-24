package Model;

import java.util.UUID;

public class Mundo {

    private UUID id;
    private String descricaoNivel;
    private String nivelMundo;
    private Inimigo inimigo;

    public Mundo(){

    }

    public Mundo(UUID id, String descricaoNivel, String nivelMundo, Inimigo inimigo) {
        this.id = id;
        this.descricaoNivel = descricaoNivel;
        this.nivelMundo = nivelMundo;
        this.inimigo = inimigo;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDescricaoNivel() {
        return descricaoNivel;
    }

    public void setDescricaoNivel(String descricaoNivel) {
        this.descricaoNivel = descricaoNivel;
    }

    public String getNivelMundo() {
        return nivelMundo;
    }

    public void setNivelMundo(String nivelMundo) {
        this.nivelMundo = nivelMundo;
    }

    public Inimigo getInimigo() {
        return inimigo;
    }

    public void setInimigo(Inimigo inimigo) {
        this.inimigo = inimigo;
    }
}
