package controller;

import model.Carro;

public class CarroController {
    public static void main(String[] args){
        Carro carro1 = new Carro("Renault", "Clio", 2007);
        System.out.println(carro1);
        Carro carro2 = new Carro("Renault", "Sandero",2011);
        Carro carro3 = new Carro("Volkswagen", "Gol", 2018);
        carro3.setMarca("Chevrolet");
        carro3.setModelo("Corsa Sedan");
        System.out.println(carro2);
        System.out.println(carro3);
        System.out.println("O ano do clio é " + carro1.getAnoFabricacao());
    }
}
