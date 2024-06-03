package src.métodos_introdução.exercícios.test;

import java.util.Scanner;

import src.métodos_introdução.exercícios.domínio.Funcionario;

public class testFuncionario {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.println("Informe o nome");
        funcionario.nome = ler.next();

        System.out.println("Informe a idade");
        funcionario.idade = ler.nextInt();

        for (int i = 0; i < funcionario.salario.length; i++) {
            System.out.println("Informe o salário " + (i + 1));
            funcionario.salario[i] = ler.nextDouble();
        }

        funcionario.imprimeDados();
        funcionario.mediaSalarial();
    }
}