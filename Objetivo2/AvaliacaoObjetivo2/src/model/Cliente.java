package model;

public class Cliente implements Associado {
    private String nome;
    private  Integer qdeCotas;
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

    public Cliente(String nome, Integer qdeCotas, Integer valorCota) {
        this.nome = nome;
        this.qdeCotas = qdeCotas;
        this.valorCota = valorCota;
    }

    @Override
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

    public static <U> U getsaldo(Conta conta) {
        return getsaldo(conta);
    }


}

