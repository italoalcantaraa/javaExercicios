package src.métodos_introdução.domínio;

public class calculator {
    public void calculatorMult(){
        System.out.println(5*5);
    }
    public void calculatorSum(){
        System.out.println(5+5);
    }
    public static void calculatorAverage(int num, int num2, int num3){
        System.out.println("A média é: " + ((num + num2 + num3) / 3));
    }

    public double avarage(int num, int num2, int num3){
        double avarage = (num + num2 + num3) / 3;

        return avarage;
    }

    public void imprimirMedia(double avarage){

        System.out.println("Média: " + avarage + "\n");
        if(avarage > 5){
            System.out.println("Aprovado!");
        }else{
            System.out.println("Reprovado!");
        }
    }
}
