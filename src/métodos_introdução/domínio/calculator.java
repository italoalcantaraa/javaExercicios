package src.métodos_introdução.domínio;

public class Calculator {
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

    public void somaArray(int[] numbers){

        int sum = 0;

        for(int num : numbers){
            sum += num;
    }
    
    System.out.println(sum);
}

public void varArgs(int... numbers){
    int sum = 0;

    for(int num : numbers){
        sum += num;
    }
    System.out.println("--------------");    
    System.out.println(sum);

}
}