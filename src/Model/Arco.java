package Model;

public class Arco extends Arma {

    private Double danoBase;
    private Boolean atributoLendario;

    public Arco(){

    }

    public Arco(Integer id, String descricao, String nivelRaridade, Double danoBase, Boolean atributoLendario) {
        super(id, descricao, nivelRaridade);
        this.danoBase = danoBase;
        this.atributoLendario = atributoLendario;
    }
}
