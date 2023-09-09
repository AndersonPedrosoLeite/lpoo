package controller;

import model.*;

public class FuncionarioController {
    public static void main(String[] args) {
            Desenvolvedor desenvolvedor1 = new Junior("Anderson", 4300.00);
            Desenvolvedor desenvolvedor2 = new Pleno("Augusto", 7580.75);
            Desenvolvedor desenvolvedor3 = new Senior();
            Funcionario gerente1 = new Gerente();
            Gerente  gerente2 = new GerenteDesenvolvimento();
            Desenvolvedor desenvolvedor4 = new Desenvolvedor();
            desenvolvedor3.setNome("Igor");
            desenvolvedor3.setSalario(5600.00);
            gerente2.setNome("Amanda");
            gerente2.setSalario(7200.00);
        System.out.println("Bônus de cada funcionário");
        System.out.println(desenvolvedor1);
        System.out.println("Bônus: " + desenvolvedor1.getBonus());

    }
}