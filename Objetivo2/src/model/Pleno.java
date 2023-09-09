package model;

public class Pleno  extends  Desenvolvedor{
    public Pleno(String nome, Double salario) {
        super(nome,salario);
    }
    @Override
    public double getBonus(){
        return getSalario() * 0.05;
    }
    @Override
    public String toString() {
        return "\nDesenvolvedorPleno{" +
                "nome='" + super.getNome() + '\'' +
                ", salario=" + super.getSalario() +
                "} " ;
    }
}
