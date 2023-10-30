package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class DistribuidoraController {
    public static void main(String[] args) {


        Produto produto1 = new Produto(1, "teclado", 300, 223.50);
        Produto produto2 = new Produto(2, "mouse", 60, 79.90);
        Produto produto3 = new Produto(3, "cadeira gamer", 74, 189.90);
        Produto produto4 = new Produto(4, "processador Ryzen 7", 138, 1134.50);
        Item item1 = new Item(1, 4.5, 300, produto1);
        Item item2 = new Item(2, 6.75, 89, produto2);
        Item item3 = new Item(3, 9.90, 65, produto3);
        Item item4 = new Item(4, 5.5, 90, produto4);

        List<Item> itensList = new ArrayList<>();
        itensList.add(item1);
        itensList.add(item2);
        itensList.add(item3);
        itensList.add(item4);
        Produto produto5 = new Produto(5, "notebook", 300, 2223.50, itensList);
        Produto produto6 = new Produto(6, "headset", 60, 179.90, itensList);
        Produto produto7 = new Produto(7, "luminaria", 74, 89.90, itensList);
        Produto produto8 = new Produto(8, "water cooler", 138, 134.50, itensList);

        Pedido pedido1 = new Pedido(1, "30/10/2023", 733.34);
        Pedido pedido2 = new Pedido(2,"30/10/2023",1259.90);



        Funcionario funcionario1 = new Gerente(1, "João", "Av. 25 de Julho", "Sta Terezinha", "2738278278", "Pelotas", "RS", "Administração de Empresas");
        Funcionario funcionario2 = new Vendedor(2, "Ana", "Rua 7 de abril", "Simões Lopes", "209302877", "Pelotas", "RS", "Centro");


        Tipo tipo1 = new Tipo(1, "Logitec",pedido1 );
        Tipo tipo2 = new Tipo(2,"Lenovo",pedido2);

        Pedido venda1 = new Pedido(1,"30/10/2023",894.34, (Vendedor) funcionario2,tipo1,item1);
        Pedido venda2 = new Pedido(2,"30/10/2023",1322.5, (Vendedor) funcionario2,tipo2,item2);

        System.out.println();
        System.out.println("Vendas realizadas: ");
        System.out.println(venda1);
        System.out.println();
        System.out.println(venda2);
        System.out.println();
        System.out.println("Quantidade Item1: " + item1.getQuantidade());
        System.out.println("Quantidade Item2: " + item2.getQuantidade());


    }
}
