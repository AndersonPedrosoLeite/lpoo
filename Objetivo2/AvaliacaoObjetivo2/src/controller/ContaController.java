package controller;

import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class ContaController {
    public static void main(String[] args) {
        Conta c1 = new ContaPoupanca(3000.00);
        Conta c2 = new ContaPoupanca(4500.00);
        Conta c3 = new ContaPoupanca(5200.00);
        Conta c4 = new ContaCorrente(6500.00);
        Conta c5 = new ContaCorrente(2200.00);
        Conta c6 = new ContaCorrente(1800.00);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
    }
}
