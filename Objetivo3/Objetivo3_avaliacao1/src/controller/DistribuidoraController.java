package controller;

import model.Produto;

public class DistribuidoraController {
    public static void main(String[] args) {
        Produto teclado = new Produto(1,"teclado",300,223.50,"periférico");
        Produto monitor = new Produto(2,"monitor",50,799.80,"hardware");
        Produto mouse = new Produto(3,"mouse",74,89.90,"periférico");
        Produto processador = new Produto(4,"processador Ryzen 7",138,1134.50,"hardware");
    }
}
