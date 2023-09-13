package model;

public class Junior extends Desenvolvedor{

    public Junior(String nome,Double salario) {
        super(nome, salario);
    }

    public Junior() {
        super();
    }

    @Override
    public double getBonus() {

        return getSalario() * 0.05;
    }

    @Override
    public String toString() {
        return "\nDesenvolvedorJunior{" +
                "nome='" + super.getNome() + '\'' +
                ", salario=" + super.getSalario() +
                "} " ;
    }
}
