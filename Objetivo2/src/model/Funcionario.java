package model;

public abstract class Funcionario {
    protected  String nome;
    protected Double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void setSalario(Double salario){

    }
    public Double getSalario(){
        return salario;
    }
    public void getBonus(Double taxa){
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
