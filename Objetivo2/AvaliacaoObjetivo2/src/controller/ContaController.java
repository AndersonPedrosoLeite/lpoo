package controller;

import model.*;

import java.util.*;

public class ContaController {
    public static void main(String[] args) {
        Conta c1 = new ContaPoupanca(3000.00);
        Conta c2 = new ContaPoupanca(4500.00);
        Conta c3 = new ContaPoupanca(5200.00);
        Conta c4 = new ContaCorrente(6500.00);
        Conta c5 = new ContaCorrente(2200.00);
        Conta c6 = new ContaCorrente(1800.00);
        Cliente a1 = new Cliente("Fernanda Monteiro",100);
        Cliente a2 = new Cliente("Cristopher Medeiros",400);
        Cliente a3 = new Cliente("Janaína Cunha",600);
        Cliente a4 = new Cliente("Elton Rudiger", 300);
        Cliente a5 = new Cliente("Márcia Nolasco", 600);
        Cliente a6 = new Cliente("João Félix",600);


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

        List <Associado> associadoList = new ArrayList<>();
        ((ArrayList) associadoList).add(a1);
        ((ArrayList) associadoList).add(a2);
        ((ArrayList) associadoList).add(a3);




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

        System.out.println();
        associadoList.sort(Comparator.comparing(Associado::getNome));
        System.out.println("Lista de clientes associados: " + associadoList);

        Map <Integer, Associado> associadosMap = new HashMap<>();
        associadosMap.put(a1.getqdeCotas(), a1);
        associadosMap.put(a2.getqdeCotas(), a2);
        associadosMap.put(a3.getqdeCotas(), a3);




    }
}
