package controller;

import model.Aluno;

public class AlunoController {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno(9224444,"joice@gmail.com");
        Aluno aluno4 = new Aluno(29844,"cris@gmail.com");
        Aluno aluno5 = new Aluno(5,355377899,"Caroline","Freitas","carol@gmail.com");
        Aluno aluno6 = new Aluno(6,4663552,"Marta","Dumont","marta@gmail.com");

        System.out.println(aluno1);
        System.out.println(aluno2);


        aluno1.setId(1);
        aluno1.setCpf(1871633);
        aluno1.setNome("Cristina");
        aluno1.setSobrenome("Santos");
        aluno1.setEmail("santos_santos@gmail.com");
        aluno2.setId(2);
        aluno2.setCpf(99581633);
        aluno2.setNome("Daniel");
        aluno2.setSobrenome("Saraiva");
        aluno2.setEmail("danielsaraiva@gmail.com");
        System.out.println("\n");
        System.out.println(" id:" + aluno1.getId() + " cpf:" + aluno1.getCpf() + " nome:" + aluno1.getNome() + " sobrenome:" + aluno1.getSobrenome() + " email:" + aluno1.getEmail());
        System.out.println("\n");
        System.out.println(" id:" + aluno2.getId() + " cpf:" + aluno2.getCpf() + " nome:" + aluno2.getNome() + " sobrenome:" + aluno2.getSobrenome() + " email:" + aluno2.getEmail());



       /* aluno3.setEmail("brusque@brusque@gmail.com");
        System.out.println("O nome da aluno(a) de id:" + aluno2.getId() + " é " + aluno2.getNome());
        aluno1.setNome("Augusto");
        System.out.println(aluno1);
        System.out.println("O cpf do aluno(a) " + aluno2.getNome() + " é " + aluno2.getCpf());
        */
    }



}
