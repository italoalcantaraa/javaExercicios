package src.classes_introdução.test;

import src.classes_introdução.diminio.Professor;

public class ProfessorTeste_01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.name = "Prof";
        professor.year = 200;
        professor.sex = 'M';

        System.out.println("Nome: " + professor.name + " Idade: " + professor.year + " Sexo: " + professor.sex);
    }
}
