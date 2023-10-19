package model;

public abstract class Conta {

    protected Double saldo;

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Conta(Double saldo) {

        this.saldo = saldo;
    }

    public void deposita(Double valor) {

        this.saldo = this.saldo + valor;
    }

    public void saca(Double valor) {
            Double valorTemporario = this.saldo - valor;
            if(valorTemporario < 0 ){
                System.out.println("Saldo insuficiente. Saldo= " + this.saldo);
                return;
            }
            this.saldo -= valor;
            System.out.println("\nSaque realizado com sucesso. Saldo atual = " + this.saldo);
    }
    public  void atualiza(Double taxa){
        this.saldo += this.saldo * (taxa/100);
    }


    public <U> U getsaldo() {
        return (U) getSaldo();
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + getSaldo() +
                '}';
    }
}
