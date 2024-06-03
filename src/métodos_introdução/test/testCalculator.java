package src.métodos_introdução.test;

import java.util.Scanner;

import src.métodos_introdução.domínio.calculator;

public class testCalculator {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        calculator calcMult = new calculator();
        calcMult.calculatorMult();

        calculator calcSum = new calculator();
        calcSum.calculatorSum();

        System.out.println("------------");

        int[] numbers = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Informe a nota: " + (i + 1) + " :");
            numbers[i] = ler.nextInt();
        }

        calculator.calculatorAverage(numbers[0], numbers[1], numbers[2]);
    }
}
