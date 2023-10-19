package model;

public  class  ContaCorrente extends Conta implements Associado {


    public ContaCorrente(Double saldo) {
        super(saldo);
    }

    @Override
    public String toString() {
        return "\nContaCorrente{" +
                "saldo=" + saldo +
                '}';
    }

    @Override
    public Double lucros(Integer qdeCotas, double valorCota) {
        return null;
    }

    @Override
    public <U> U getNome() {
        return null;
    }

    @Override
    public <U> U getqdeCotas() {
        return null;
    }
}

