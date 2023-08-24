package controller;

import model.Aluno;

public class AlunoController {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(1,377255,"João","Leivas","joao@gmail.com");
        Aluno aluno2 = new Aluno(2,484837,"Maria","Amaral","maria@gmail.com");
        Aluno aluno3 = new Aluno(3,9224444,"Joice","Brusque","joice@gmail.com");
        Aluno aluno4 = new Aluno(4,298440,"Cristina","Ruchell","cris@gmail.com");


        aluno1.setNome("Augusto");
        aluno3.setEmail("brusque@brusque@gmail.com");
        System.out.println(aluno3);
        System.out.println("O nome da aluno(a) de id:" + aluno2.getId() + " é " + aluno2.getNome());
        System.out.println(aluno1);
        System.out.println("O cpf do aluno(a) " + aluno2.getNome() + " é " + aluno2.getCpf());
    }


}
