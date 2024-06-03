package src.métodos_introdução.test;

import src.métodos_introdução.domínio.Aluno;
import src.métodos_introdução.domínio.imprimirAluno;

public class testAluno_01 {    
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Aluno aluno2 = new Aluno();
        imprimirAluno impressora = new imprimirAluno();

        aluno.nome = "Italo";
        aluno.idade = 18;
        aluno.sexo = 'M';

        aluno2.nome = "Jão";
        aluno2.idade = 100;
        aluno2.sexo = 'M';

        impressora.imprimir(aluno);
        System.out.println("-------------------");
        impressora.imprimir(aluno2);

    }
}
