package model;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private int codigo;
    private String nome;
    private int quantidade;
    private double preco;

    Fornecedor fornecedor;
    public Produto() {
    }

    public Produto(int codigo, String nome, int quantidade, double preco, List<Item> itensList) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;

    }

    public Produto(int codigo, String nome, int quantidade, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;

    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }





    public void baixaEstoque() {
        try {
            this.quantidade = quantidade - 1;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
    public void adicionaEstoque(){
        this.quantidade = quantidade + 1;
    }
    @Override
    public String toString() {
        return "\nProduto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                '}';
    }
}
