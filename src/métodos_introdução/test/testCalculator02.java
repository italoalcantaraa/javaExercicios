package src.métodos_introdução.test;

import src.métodos_introdução.domínio.Calculator;

public class testCalculator02 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int[] numbers = {1,2,3,4,5,6,7};
        calculator.somaArray(numbers);
        calculator.varArgs(1,2,3,4,5,6,7);
    }
}
