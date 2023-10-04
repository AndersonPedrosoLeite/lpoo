package model;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Double saldo) {
        super(saldo);
    }

    @Override
    public String toString() {
        return "\nContaPoupanca{" +
                "saldo=" + saldo +
                '}';
    }
}

