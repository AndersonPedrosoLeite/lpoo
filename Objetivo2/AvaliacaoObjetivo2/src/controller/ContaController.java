package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class ContaController {
    public static void main(String[] args) {
        Conta c1 = new ContaPoupanca(3000.00);
        Conta c2 = new ContaPoupanca(4500.00);
        Conta c3 = new ContaPoupanca(5200.00);
        Conta c4 = new ContaCorrente(6500.00);
        Conta c5 = new ContaCorrente(2200.00);
        Conta c6 = new ContaCorrente(1800.00);
        Associado a1 = new Cliente("Fernanda Monteiro",100);
        Associado a2 = new Cliente("Cristopher Medeiros",400);
        Associado a3 = new Cliente("Janaína Cunha",600);
        Associado a4 = new Cliente("Elton Rudiger", 300);
        Associado a5 = new Cliente("Márcia Nolasco", 600);
        Associado a6 = new Cliente("João Félix",600);


        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);


        List<Conta> contaList = new ArrayList<>();
        contaList.add(c1);
        contaList.add(c2);
        contaList.add(c3);
        contaList.add(c4);
        contaList.add(c5);
        contaList.add(c6);

        List<Associado> associadoList = new ArrayList<>();

        associadoList.add(a1);
        associadoList.add(a2);
        associadoList.add(a3);
        associadoList.add(a4);
        associadoList.add(a5);
        associadoList.add(a6);

        System.out.println("Contas cadastradas no sistema: ");
        System.out.println(contaList);

        System.out.println("Lista de associados: ");
        System.out.println(associadoList);

        c1.deposita(1000.00);
        System.out.println("Saldo da conta c1:" +c1);
        c1.atualiza(5.0);
        System.out.println("Saldo atualizado da conta C1:" + c1);

        c1.saca(50.0);
        System.out.println("Saque de R$ 50,00 na conta C1. Saldo atual");
        System.out.println("Saldo da conta c1:" + c1);

        System.out.println("Saldo da conta c5:" + c5);
        c5.deposita(500.0);
        System.out.println("Deposito de R$500 na conta corrente c5.");
        System.out.println("Saldo atual da conta c5: " + c5);
        System.out.println("Saque de R$400 na conta corrente c5.");
        c5.saca(400.0);


    }
}
