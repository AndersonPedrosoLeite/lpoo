package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class DistribuidoraController {
    public static void main(String[] args) {


        Produto produto1 = new Produto(1, "teclado", 300, 223.50, "periférico");
        Produto produto2 = new Produto(2, "mouse", 60, 79.90, "periférico");
        Produto produto3 = new Produto(3, "cadeira gamer", 74, 189.90, "acessório");
        Produto produto4 = new Produto(4, "processador Ryzen 7", 138, 1134.50, "hardware");
        Item item1 = new Item(1, 4.5, 300, produto1);
        Item item2 = new Item(2, 6.75, 89, produto2);
        Item item3 = new Item(3, 9.90, 65, produto3);
        Item item4 = new Item(4, 5.5, 90, produto4);
        List<Item> itensList = new ArrayList<>();
        itensList.add(item1);
        itensList.add(item2);
        itensList.add(item3);
        itensList.add(item4);


        Funcionario funcionario1 = new Gerente(1, "João", "Av. 25 de Julho", "Sta Terezinha", "2738278278", "Pelotas", "RS", "Administração de Empresas");
        List<Pedido> pedidosList = null;
        Funcionario funcionario2 = new Vendedor(2, "Ana", "Rua 7 de abril", "Simões Lopes", "209302877", "Pelotas", "RS", "Centro", pedidosList);

        Pedido pedido1 = new Pedido(1, "28/10/2023", 34.50, funcionario2);
        Tipo tipo1 = new Tipo(1, "Logitec", pedido1);
        pedidosList = new ArrayList<>();
        pedidosList.add(pedido1);
    }
}
