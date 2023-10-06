package model;

public class Cliente implements Associado{
    private String nome;

    public Cliente() {
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public Double lucros(int qdeCotas, double valorCota) {
        return null;
    }

    @Override
    public String toString() {
        return "\nCliente{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
