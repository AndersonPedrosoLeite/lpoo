package model;

public class Cliente implements Associado{
    private String nome;
    private  Integer qdeCotas;
    private Integer valorCota;

    public Cliente() {
    }

    public Cliente(String nome, int qdeCotas) {
        this.nome = nome;
        this.qdeCotas = qdeCotas;
    }

    @Override
    public Double lucros(int qdeCotas, double valorCota) {
        return null;
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

