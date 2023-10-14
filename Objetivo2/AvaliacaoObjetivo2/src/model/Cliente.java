package model;

public class Cliente implements Associado{
    private String nome;
    private Integer qdeCotas;
    private Integer valorCota;

    public Cliente() {
        super();
    }

    public Cliente(String nome, Integer qdeCotas) {
        this.nome = nome;
        this.qdeCotas = qdeCotas;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public Integer getqdeCotas() {

        return qdeCotas;
    }

    public void setqdeCotas(Integer qdeCotas) {

        this.qdeCotas = qdeCotas;
    }

    public Integer getValorCota() {

        return valorCota;
    }

    public void setValorCota(Integer valorCota) {

        this.valorCota = valorCota;
    }
    public Integer getqdeCotas(Integer qdeCotas){
        return qdeCotas;
    }


    //@Override
    public Double lucros(Integer qdeCotas, double valorCota) {
        return qdeCotas * valorCota;
    }

    @Override
    public String toString() {
        return "\nCliente{" +
                "nome='" + nome + '\'' +
                ", qdeCotas=" + qdeCotas +
                ", valorCota=" + valorCota +
                '}';
    }
}

