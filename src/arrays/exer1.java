package src.arrays;

import java.util.Scanner;

public class exer1 {
    public static void main(String[] args) {

        int tamanhoArray, maiorNum = 0, menorNum = 0 ;

        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o tamanho do array: ");       
        tamanhoArray = ler.nextInt();
    
        int[] array = new int [tamanhoArray];

        System.out.println("Agora vamos preencher o array \n");

        //Preencher o array 
        for(int i = 0; i < tamanhoArray; i++){
            System.out.println("Informe a " + i + "º posição: ");
            array[i] = ler.nextInt();
        }

        //Verifica o maior número
        for(int i = 0; i < tamanhoArray; i++){
            if(array[i] > maiorNum){
                maiorNum = array[i];
            }
        }

        //Verifica o menor número
        for(int i = 0; i < tamanhoArray; i++){
            menorNum = array[0];

            if(array[i] < menorNum){
                menorNum = array[i];
            }
        }

        System.out.println("O menor número é: " + menorNum);
        System.out.println("O maior número é: " + maiorNum);
    }
}
