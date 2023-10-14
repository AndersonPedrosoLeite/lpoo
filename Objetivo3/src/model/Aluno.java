package model;

import java.util.List;

public class Aluno {
    private Integer matricula;
    private  String nome;
    private String sobrenome;
    

    public Aluno(Integer matricula, String nome, String sobrenome) {
        this.matricula = matricula;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
}
