package src.métodos_introdução.exercícios.domínio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario = new double[3];

    public void imprimeDados() {
        System.out.println("--------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        if(salario == null){
            return;
        }
        System.out.println("Salário: ");
        for (double i : salario) {
            System.out.println(i);
        }

    }

    public void mediaSalarial() {
        if(salario == null){
            return;
        }
        int sum = 0;

        for (double num : salario) {
            sum += num;
        }
        int media = sum / salario.length;
        System.out.println("-----------------------");
        System.out.println("Média salarial: " + media);
    }
}
