package controller;

import model.*;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioController {
    public static void main(String[] args) {
            Gerente gerente1 = new GerenteGeral("Mariana",6500.00);
            Gerente gerente2 = new GerenteDesenvolvimento("Gustavo", 4500.00);

            Desenvolvedor desenvolvedor1 = new Senior("Antônio", 4300.00);
            Desenvolvedor desenvolvedor2 = new Senior("Laura",3500.00);
            Desenvolvedor desenvolvedor3 = new Senior("Felipe",3500.00);
            Desenvolvedor desenvolvedor4 = new Senior("Roberta",3500.00);
            Desenvolvedor desenvolvedor5 = new Senior("Julia",3500.00);
            Desenvolvedor desenvolvedor6 = new Senior("Marcos",3500.00);

            Desenvolvedor desenvolvedor7 = new Pleno("Carla",2500.00);
            Desenvolvedor desenvolvedor8 = new Pleno("Fabiane",2500.00);
            Desenvolvedor desenvolvedor9 = new Pleno("Rafael",2500.00);
            Desenvolvedor desenvolvedor10 = new Pleno("João",2500.00);
            Desenvolvedor desenvolvedor11 = new Pleno("Fernando",2500.00);
            Desenvolvedor desenvolvedor12 = new Pleno("Augusto", 2500.00);

            Desenvolvedor desenvolvedor13 = new Junior("Anderson",1800.00);
            Desenvolvedor desenvolvedor14 = new Junior("Gabriela",1800.00);
            Desenvolvedor desenvolvedor15 = new Junior("Carlos",1800.00);
            Desenvolvedor desenvolvedor16 = new Junior("Nicolas",1800.00);
            Desenvolvedor desenvolvedor17 = new Junior("Amanda",1800.00);
            Desenvolvedor desenvolvedor18 = new Junior("Izac",1800.00);

            System.out.println("Bônus de cada funcionário");
            System.out.println(gerente1 + " Bônus: " + gerente1.getBonus());
            System.out.println(gerente2 + " Bônus: " + gerente2.getBonus());
            System.out.println(desenvolvedor1 + " Bônus: " + desenvolvedor1.getBonus());
            System.out.println(desenvolvedor2 + " Bônus: " + desenvolvedor2.getBonus());
            System.out.println(desenvolvedor3 + " Bônus: " + desenvolvedor3.getBonus());
            System.out.println(desenvolvedor4 + " Bônus: " + desenvolvedor4.getBonus());
            System.out.println(desenvolvedor5 + " Bônus: " + desenvolvedor5.getBonus());
            System.out.println(desenvolvedor6 + " Bônus: " + desenvolvedor6.getBonus());
            System.out.println(desenvolvedor7 + " Bônus: " + desenvolvedor7.getBonus());
            System.out.println(desenvolvedor8 + " Bônus: " + desenvolvedor8.getBonus());
            System.out.println(desenvolvedor9 + " Bônus: " + desenvolvedor9.getBonus());
            System.out.println(desenvolvedor10 + " Bônus: " + desenvolvedor10.getBonus());
            System.out.println(desenvolvedor11 + " Bônus: " + desenvolvedor11.getBonus());
            System.out.println(desenvolvedor12 + " Bônus: " + desenvolvedor12.getBonus());
            System.out.println(desenvolvedor13 + " Bônus: " + desenvolvedor13.getBonus());
            System.out.println(desenvolvedor14 + " Bônus: " + desenvolvedor14.getBonus());
            System.out.println(desenvolvedor15 + " Bônus: " + desenvolvedor15.getBonus());
            System.out.println(desenvolvedor16 + " Bônus: " + desenvolvedor16.getBonus());
            System.out.println(desenvolvedor17 + " Bônus: " + desenvolvedor17.getBonus());
            System.out.println(desenvolvedor18 + " Bônus: " + desenvolvedor18.getBonus());

        List<Funcionario> funcionarios = new ArrayList<>();
            funcionarios.add(gerente1);
            funcionarios.add(gerente2);
            funcionarios.add(desenvolvedor1);
            funcionarios.add(desenvolvedor2);
            funcionarios.add(desenvolvedor3);
            funcionarios.add(desenvolvedor4);
            funcionarios.add(desenvolvedor5);
            funcionarios.add(desenvolvedor6);
            funcionarios.add(desenvolvedor7);
            funcionarios.add(desenvolvedor8);
            funcionarios.add(desenvolvedor9);
            funcionarios.add(desenvolvedor10);
            funcionarios.add(desenvolvedor11);
            funcionarios.add(desenvolvedor12);
            funcionarios.add(desenvolvedor13);
            funcionarios.add(desenvolvedor14);
            funcionarios.add(desenvolvedor15);
            funcionarios.add(desenvolvedor16);
            funcionarios.add(desenvolvedor17);
            funcionarios.add(desenvolvedor18);

            System.out.println("Lista de funcionários e seus respectivos salários\n" + funcionarios);
            double total_folha_com_bonus = 0.0;
            for (Funcionario funcionario : funcionarios) {
                total_folha_com_bonus += funcionario.getSalario() + funcionario.getBonus();
            }
            System.out.println("Total da folha salarial + bônus: ");
            System.out.println(NumberFormat.getCurrencyInstance().format(total_folha_com_bonus));



    }
}