package model;

public abstract class Funcionario {   //abstract impede que criem-se instâncias na classe//
    protected   String nome;
    protected Double salario;

    public Funcionario() {
        super();
    }

    public Funcionario(String nome, Double salario) {
        super();
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public abstract double getBonus();
}
