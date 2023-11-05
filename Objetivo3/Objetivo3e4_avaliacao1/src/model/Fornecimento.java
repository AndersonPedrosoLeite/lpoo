package model;

import java.util.ArrayList;
import java.util.List;

public class Fornecimento {
    private String data;
    private double valorTotal;
    Fornecedor fornecedor;
    Produto produto;
    List <Produto> produtosList = new ArrayList<>();

    public Fornecimento() {
    }

    public Fornecimento(String data, double valorTotal, Fornecedor fornecedor, Produto produto) {
        this.data = data;
        this.valorTotal = valorTotal;
        this.fornecedor = fornecedor;
        this.produto = produto;
    }



    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }


    public List<Produto> getProdutosList() {
        return produtosList;
    }

    public void setProdutosList(List<Produto> produtosList) {
        this.produtosList = produtosList;
    }


    @Override
    public String toString() {
        return "\nFornecimento{" +
                "data='" + data + '\'' +
                ", valorTotal=" + valorTotal +
                ", fornecedor=" + fornecedor +
                ", produto=" + produto +
                '}';
    }
}
