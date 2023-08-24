package model;

public class Aluno {
    private Integer id;
    private Integer cpf;
    private String nome;
    private  String sobrenome;
    private String email;

    public Aluno() {
    }

    public Aluno(Integer id, Integer cpf, String nome, String sobrenome, String email) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
    }
}
