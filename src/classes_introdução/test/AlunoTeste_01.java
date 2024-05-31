package src.classes_introdução.test;

import src.classes_introdução.diminio.Aluno;

public class AlunoTeste_01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Aluno aluno2 = new Aluno();

        aluno.year = 18;
        aluno.sex = 'M';

        aluno2.name = "Simone";
        aluno2.year = 20;
        aluno2.sex = 'F';

        System.out.println(aluno.name);
        System.out.println(aluno.year);
        System.out.println(aluno.sex);
        System.out.println("------------");
        System.out.println(aluno2.name);
        System.out.println(aluno2.year);
        System.out.println(aluno2.sex);

    }
}
