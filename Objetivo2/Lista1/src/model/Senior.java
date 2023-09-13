package model;

public class Senior extends Desenvolvedor{
    public Senior() {
        super();
    }

    public Senior(String nome, Double salario) {
        super(nome, salario);
    }
    @Override
    public double getBonus(){
        return getSalario() * 0.1;
    }
    @Override
    public String toString() {
        return "\nDesenvolvedorSenior{" +
                "nome='" + super.getNome() + '\'' +
                ", salario=" + super.getSalario() +
                "} " ;
    }
}
