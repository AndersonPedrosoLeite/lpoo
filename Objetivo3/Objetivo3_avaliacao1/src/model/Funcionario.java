package model;

public class Funcionario {
    private int matricula;
    private String nome;
    private String endereco;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;

    public boolean manterfunc(int matricula){
        this.matricula = matricula;
        return false;
    }

}