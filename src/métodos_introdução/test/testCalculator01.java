package src.métodos_introdução.test;

import java.util.Scanner;

import src.métodos_introdução.domínio.Calculator;

public class testCalculator01 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int[] avarage = new int[3];

        for(int i = 0; i < avarage.length; i ++){
            System.out.println("Informe a nota " + (i + 1) + ": ");
            avarage[i] = ler.nextInt();
        }

        Calculator resultAvarage = new Calculator();
        double media = resultAvarage.avarage(avarage[0], avarage[1], avarage[2]);

        Calculator print = new Calculator();
        print.imprimirMedia(media); 
    }
}
