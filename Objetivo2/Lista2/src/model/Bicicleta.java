package model;

public class Bicicleta extends Veiculo{
    private Integer tamanhodaRoda;
    private String chassi;

    public Bicicleta() {
        super();
    }

    public Bicicleta(Integer tamanhodaRoda, String chassi) {
        this.tamanhodaRoda = tamanhodaRoda;
        this.chassi = chassi;
    }

    public Bicicleta(Integer numeroDeEixos, String propulsao, String marca, String modelo, Integer anoFabricacao, Integer tamanhodaRoda, String chassi) {
        super(numeroDeEixos, propulsao, marca, modelo, anoFabricacao);
        this.tamanhodaRoda = tamanhodaRoda;
        this.chassi = chassi;
    }

    public Integer getTamanhodaRoda() {
        return tamanhodaRoda;
    }

    public void setTamanhodaRoda(Integer tamanhodaRoda) {
        this.tamanhodaRoda = tamanhodaRoda;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    @Override
    public String toString() {
        return "\nBicicleta{" +
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
