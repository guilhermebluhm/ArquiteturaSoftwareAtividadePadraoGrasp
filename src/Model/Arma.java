package Model;

public class Arma {

    private Integer id;
    private String descricao;
    private String nivelRaridade;

    public Arma(){

    }

    public Arma(Integer id, String descricao, String nivelRaridade) {
        this.id = id;
        this.descricao = descricao;
        this.nivelRaridade = nivelRaridade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNivelRaridade() {
        return nivelRaridade;
    }

    public void setNivelRaridade(String nivelRaridade) {
        this.nivelRaridade = nivelRaridade;
    }
}
