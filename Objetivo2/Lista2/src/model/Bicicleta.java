package model;

public class Bicicleta extends Veiculo{
    private Integer tamanhodaRoda;
    private String chassi;

    public Bicicleta() {
        super();
    }

    @Override
    public String toString() {
        return "\nmodel.Bicicleta{" +
                "tamanhodaRoda=" + tamanhodaRoda +
                ", chassi='" + chassi + '\'' +
                ", numeroDeEixos=" + getNumeroDeEixos() +
                ", propulsao='" + getPropulsao() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", anoFabricacao=" + getAnoFabricacao() +
                '}';
    }
}
