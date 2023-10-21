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
        Cliente a1 = new Cliente("Fernanda Monteiro",100,22);
        Cliente a2 = new Cliente("Cristopher Medeiros",400,43);
        Cliente a3 = new Cliente("Janaína Cunha",600,30);
        Cliente a4 = new Cliente("Elton Rudiger", 300,18);
        Cliente a5 = new Cliente("Márcia Nolasco", 600,9);
        Cliente a6 = new Cliente("João Félix",600,12);


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

        List<Cliente> associadoList = new ArrayList<>();
        ((ArrayList) associadoList).add(a1);
        ((ArrayList) associadoList).add(a2);
        ((ArrayList) associadoList).add(a3);
        ((ArrayList) associadoList).add(a4);
        ((ArrayList) associadoList).add(a5);
        ((ArrayList) associadoList).add(a6);




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

        System.out.println();
        associadoList.sort(Comparator.comparing(Cliente::getqdeCotas).reversed());
        System.out.println("Lista dos clientes associados e suas respectivas cotas em ordem decrescente: " + associadoList);

        Map<Integer, Cliente> clientesMap = new HashMap<>();
        clientesMap.put(a1.getqdeCotas(), a1);
        clientesMap.put(a2.getqdeCotas(), a2);
        clientesMap.put(a3.getqdeCotas(), a3);
        clientesMap.put(a4.getqdeCotas(), a4);
        clientesMap.put(a5.getqdeCotas(), a5);
        clientesMap.put(a6.getqdeCotas(), a6);
        System.out.println();
        Associado associadofind = associadoList.stream().filter(c -> c.getqdeCotas().equals(600)).findAny().orElse(null);
        System.out.println("Associados com maior número de cotas: " + associadofind);



        //g
        System.out.println();
        contaList.sort(Comparator.comparing(Conta::getsaldo));
        System.out.println("Contas cadastradas no sistema: " + contaList);
        System.out.println();
        System.out.println(associadoList);
        System.out.println();
        System.out.println("Conta com maior saldo bancário: ");

    }
}
