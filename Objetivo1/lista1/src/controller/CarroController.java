package controller;

import model.Carro;

import java.util.*;

public class CarroController {
    public static void main(String[] args){
        Carro carro1 = new Carro(1,"Renault", "Clio", 2007);
        System.out.println(carro1);
        Carro carro2 = new Carro(2,"Renault", "Sandero",2011);
        Carro carro3 = new Carro(3,"Volkswagen", "Gol", 2018);
        Carro carro4 = new Carro(4,"Hiunday","Azera",2012);
        Carro carro5 = new Carro(5,"Fiat","Punto",2015);
        carro3.setMarca("Chevrolet");
        carro3.setModelo("Corsa Sedan");
        System.out.println(carro2);
        System.out.println(carro3);
        System.out.println("O ano do Renault Clio é " + carro1.getAnoFabricacao());

        List<Carro> carros = new ArrayList<>();
        carros.add(carro1);
        carros.add(carro2);
        carros.add(carro3);
        carros.add(carro4);
        carros.add(carro5);

        System.out.println(carros);
        //ORDENAÇÃO
        carros.sort(Comparator.comparing(Carro::getAnoFabricacao).reversed());
        System.out.println(carros);

        //PESQUISA
        Carro carroFind = carros.stream().filter(c -> c.getModelo().equals("Gol")).findAny().orElse(null);
        System.out.println(carroFind);
        Carro carro1Find = carros.stream().filter(c -> c.getId().equals(1)).findAny().orElse(null);
        System.out.println(carro1Find);

        //COLEÇÃO  TIPO MAP
        Map<String, Carro> carrosMap = new HashMap<>();
        carrosMap.put(carro1.getModelo(), carro1 );
        carrosMap.put(carro2.getModelo(), carro2 );
        carrosMap.put(carro3.getModelo(), carro3 );
        carrosMap.put(carro4.getModelo(), carro4 );
        carrosMap.put(carro5.getModelo(), carro5 );

        System.out.println("Coleção do tipo map");
        System.out.println("\n");
        System.out.println(carrosMap + "\n");
        System.out.println("\n Localizar Carro na coleção Map");
        System.out.println(carrosMap.get(carro3.getModelo()));
    }
}
