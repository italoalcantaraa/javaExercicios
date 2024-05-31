package src.aula1_Arrays;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o tamanho do array: ");
        byte sizeArray = ler.nextByte();

        int[] array = new int[sizeArray];

        int count = 0;

        while (count < array.length) {
            System.out.println("Informe o valor " + (count + 1) + ": ");
            array[count] = ler.nextInt();

            count++;
        }

        System.out.println("Valores: ");
        for (int num : array) {
            System.out.println(num);
        }

    }
}
