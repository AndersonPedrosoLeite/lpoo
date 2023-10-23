package model;

import java.util.ArrayList;
import java.util.List;

public class Fornecimento {
    private String data;
    private double valorTotal;
    List <Fornecedor> fornecedoresList = new ArrayList<>();
    List <Produto> produtosList = new ArrayList<>();
}
