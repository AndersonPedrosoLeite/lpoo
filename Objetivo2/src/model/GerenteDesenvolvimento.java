package model;

public class GerenteDesenvolvimento extends Gerente{
    public GerenteDesenvolvimento() {
        super();
    }
    public  GerenteDesenvolvimento(String nome, Double salario){
        super(nome,salario);
    }
    @Override
    public double getBonus(){
        return getSalario() * 0.2;
    }
    @Override
    public String toString() {
        return "\nGerenteDesenvolvimento{" +
                "nome='" + super.getNome() + '\'' +
                ", salario=" + super.getSalario() +
                "} " ;
    }
}
