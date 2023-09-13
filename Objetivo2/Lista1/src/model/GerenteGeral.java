package model;

public class GerenteGeral extends Gerente{
    public GerenteGeral() {
        super();
    }

    public GerenteGeral(String nome, Double salario) {

        super(nome, salario);
    }
    @Override
    public double getBonus(){
        return getSalario() * 0.4;
    }

    @Override
    public String toString() {
            return "\nGerenteGeral{" +
                    "nome='" + super.getNome() + '\'' +
                    ", salario=" + super.getSalario() +
                    "} " ;
        }
}
