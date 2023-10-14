package model;

import java.util.List;

public class Disciplina {
    private Long codigo;
    private String nome;
    private List<Disciplina> disciplinaList;

    public Disciplina(Long codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }
}
