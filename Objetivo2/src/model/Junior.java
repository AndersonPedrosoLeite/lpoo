package model;

public class Junior extends Desenvolvedor{

    public Junior(String nome,Double salario) {
        super();
    }
    @Override
    public double getBonus() {
        return getSalario() * (5/100);
    }
}
