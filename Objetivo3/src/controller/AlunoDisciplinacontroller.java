package controller;

import model.Aluno;
import model.Disciplina;

import java.util.ArrayList;
import java.util.List;

public class AlunoDisciplinacontroller {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(1,"Jefferson","Rodrigues");
        Aluno a2 = new Aluno(2,"Mariana", "Saraiva");
        Disciplina d1 = new Disciplina(34L,"Organização de Computadores");
        Disciplina d2 = new Disciplina(21L,"Java");
        Disciplina d3 = new Disciplina(10L, "CyberSegurança");

        List <Disciplina> disciplinaList = new ArrayList<>();
        disciplinaList.add(d1);
        disciplinaList.add(d2);
        disciplinaList.add(d3);
    }


}
