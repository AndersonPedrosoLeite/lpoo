package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class DistribuidoraController {
    public static void main(String[] args) {
        Produto teclado = new Produto(1, "teclado", 300, 223.50, "periférico");
        Produto monitor = new Produto(2, "monitor", 50, 799.80, "hardware");
        Produto mouse = new Produto(3, "mouse", 74, 89.90, "periférico");
        Produto processador = new Produto(4, "processador Ryzen 7", 138, 1134.50, "hardware");
        Tipo tipo1 = new Tipo(1,"fortrek",new Pedido());
        Item item1 = new Item(1,4.5,4,teclado);

        List<Pedido> pedidosList = null;
        Vendedor vendedor1 = new Vendedor(23, "Marisa", "Rua Tiradentes", "Centro", "29839823", "Pelotas", "RS", "Padaria", pedidosList);
        Pedido pedido1 = new Pedido(1, "25/10/2023", 223.5,vendedor1,tipo1,item1);

        pedidosList = new ArrayList<>();
        pedidosList.add(pedido1);

        System.out.println(pedidosList);

    }
}
