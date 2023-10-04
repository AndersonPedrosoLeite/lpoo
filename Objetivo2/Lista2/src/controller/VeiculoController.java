package controller;

import model.*;

import java.util.*;

public class VeiculoController {
    public static void main(String[] args) {
        Veiculo b1 = new Bicicleta(2,"humana", "Caloi", "esportiva", 2019, 28, "91uhd837827");
        System.out.println(b1);
        Veiculo b2 = new Bicicleta(1,"humana","Monark","monociclo",1992, 29,"203902484jk");
        Veiculo b3 = new Bicicleta(2,"humana","shimano","corrida", 2021, 18,"827823GGLK0");
        Veiculo b4 = new Bicicleta(2,"elétrica","Agrale","passeio",2020,19,"9823UUY66");
        Veiculo b5 = new Bicicleta(2,"humana","Caloi","passeio",2015,29,"8278327ggge");
        Veiculo c1 = new Carro(2,"motor de combustão a gasolina", "Fiat","sedan", 2019, 200, "287382gg44","23shqush9eo","UHT2848");
        System.out.println(c1);
        Veiculo c2 = new Carro(2,"motor de combustão a gasolina","Bmw","SUV",2022, 270,"EUYD55288","89287742299","ILF2599");
        Veiculo c3 = new Carro(6,"motor de combustão","Dodge","aminhonete super truck", 2018, 950, "774YYWU45", "982918HHD","AHJ3114");
        Veiculo c4 = new Carro(2, "motor híbrido", "Audi", "SUV", 2023, 700,"982983gdg", "298927HDSHD", "ACD33305" );
        Veiculo c5 = new Carro(2, "motor elétrico", "Tesla", "hatch", 2021, 200, "91891898HHGDG","8273GGGD","IOO5960");
        Veiculo ca1 = new Caminhao(7,"motor de combustão a diesel","Scania","Bitrem",2018,7000,"oie398493847","iadihwdbhbdh","AOC2935");
        Veiculo ca2 = new Caminhao(9,"motor de combustão a diesel", "Mercedes-Benz", "Rodotrem", 2016, 12000, "2982DGERDD","238928HDHDGD","WCA4577" );
        Veiculo ca3 = new Caminhao(4,"motor a diesel", "Iveco", "carreta", 2014, 4700, "28728TTER", "0982HHDSG", "AVI1105");
        Veiculo ca4 = new Caminhao(5, "motor a diesel", "Volkswagen", "carreta",2019, 6900, "IQUIWQU7773","298398HHD","AJK2119");
        Veiculo ca5 = new Caminhao(7, "motor de combustão a diesel", "Scania", "Bitrem",2016, 13000,"827827YYHH","8283HDGG","AVY7029");

        System.out.println(ca1);

        List <Veiculo> veiculoList = new ArrayList<>();
        veiculoList.add(b1);
        veiculoList.add(b2);
        veiculoList.add(b3);
        veiculoList.add(b4);
        veiculoList.add(b5);
        veiculoList.add(c1);
        veiculoList.add(c2);
        veiculoList.add(c3);
        veiculoList.add(c4);
        veiculoList.add(c5);
        veiculoList.add(ca1);
        veiculoList.add(ca2);
        veiculoList.add(ca3);
        veiculoList.add(ca4);
        veiculoList.add(ca5);

        System.out.println("Veículos cadastrados no sistema ordenados por ano de fabricação:");
        veiculoList.sort(Comparator.comparing(Veiculo::getAnoFabricacao).reversed());
        System.out.println(veiculoList);

        Map<Integer, Bicicleta> bicicletaMap = new HashMap<>();
        bicicletaMap.put(b1.getAnoFabricacao(), (Bicicleta) b1);
        bicicletaMap.put(b2.getAnoFabricacao(), (Bicicleta) b2);
        bicicletaMap.put(b3.getAnoFabricacao(), (Bicicleta) b3);
        bicicletaMap.put(b4.getAnoFabricacao(), (Bicicleta) b4);
        bicicletaMap.put(b5.getAnoFabricacao(), (Bicicleta) b5);

        System.out.println("Lista de bicicletas cadastradas no sistema");
        System.out.println(bicicletaMap);


    }
}
