package model;

public class Gerente  extends  Funcionario{

    @Override
    public String toString() {
        return "Gerente{" +
                "salario=" + salario +
                '}';
    }

    @Override
    public double getBonus() {
        return  getSalario() * (20/100);
    }
}
