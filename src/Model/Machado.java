package Model;

public class Machado extends Arma {

    private Double danoBase;
    private Boolean atributoLendario;

    public Machado(){

    }

    public Machado(Integer id, String descricao, String nivelRaridade, Double danoBase, Boolean atributoLendario) {
        super(id, descricao, nivelRaridade);
        this.danoBase = danoBase;
        this.atributoLendario = atributoLendario;
    }

    public Double getDanoBase() {
        return danoBase;
    }

    public void setDanoBase(Double danoBase) {
        this.danoBase = danoBase;
    }

    public Boolean getAtributoLendario() {
        return atributoLendario;
    }

    public void setAtributoLendario(Boolean atributoLendario) {
        this.atributoLendario = atributoLendario;
    }
}
