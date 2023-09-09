package model;

public class Gerente  extends  Funcionario{

    public Gerente() {
        super();
    }

    public Gerente(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return  getSalario() * 0.2;
    }

    @Override
    public String toString() {
        return "\nGerente{" +
                "nome='" + super.getNome() + '\'' +
                ", salario=" + super.getSalario() +
                "} " ;
    }
}
