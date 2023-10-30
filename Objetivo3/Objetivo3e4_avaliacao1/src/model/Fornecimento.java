package model;

import java.util.ArrayList;
import java.util.List;

public class Fornecimento {
    private String data;
    private double valorTotal;
    List <Fornecedor> fornecedoresList = new ArrayList<>();
    List <Produto> produtosList = new ArrayList<>();

    public Fornecimento() {
    }

    public Fornecimento(String data, double valorTotal, List<Fornecedor> fornecedoresList, List<Produto> produtosList) {
        this.data = data;
        this.valorTotal = valorTotal;
        this.fornecedoresList = fornecedoresList;
        this.produtosList = produtosList;
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

    public List<Fornecedor> getFornecedoresList() {
        return fornecedoresList;
    }

    public void setFornecedoresList(List<Fornecedor> fornecedoresList) {
        this.fornecedoresList = fornecedoresList;
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
                ", fornecedoresList=" + fornecedoresList +
                ", produtosList=" + produtosList +
                '}';
    }
}
