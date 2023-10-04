package model;

public class ContaCorrente extends Conta implements Associado {


    public ContaCorrente(Double saldo) {
        super(saldo);
    }

    @Override
    public Double lucros(int qdeCotas, double valorCota) {
        return null;
    }

    @Override
    public String toString() {
        return "\nContaCorrente{" +
                "saldo=" + saldo +
                '}';
    }
}

