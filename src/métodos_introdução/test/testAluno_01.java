package src.métodos_introdução.test;

import src.métodos_introdução.domínio.Aluno;

public class testAluno_01 {    
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Aluno aluno2 = new Aluno();

        aluno.nome = "Italo";
        aluno.idade = 18;
        aluno.sexo = 'M';

        aluno2.nome = "Zé";
        aluno2.idade = 88;
        aluno2.sexo = 'M';

        aluno.imprimir();
        aluno2.imprimir();
    }
}
