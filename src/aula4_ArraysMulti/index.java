package src.aula4_ArraysMulti;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Olá, seja bem-vindo(a)!");
        System.out.println("Informe a quantidade de matérias: ");
        int quantityOfMaterials = ler.nextInt();

        int[][] mediumMaterial = new int[quantityOfMaterials][];
        int[] sum = new int[quantityOfMaterials];
        int[] average = new int[mediumMaterial.length];
        
        for(int i = 0; i < mediumMaterial.length; i ++){
            average[i] = 0;
        }

        // Define o a quantidade de notas de acordo com cada matéria
        for (int i = 0; i < mediumMaterial.length; i++) {
            System.out.println("Informe a quantidade de notas da matéria " + (i + 1) + ": ");
            int quantityOfNotes = ler.nextInt();

            mediumMaterial[i] = new int[quantityOfNotes];
        }

        // Popula a matriz
        for (int i = 0; i < mediumMaterial.length; i++) {
            System.out.println("Informe as notas da matéria: " + (i + 1) + ": ");
            for (int j = 0; j < mediumMaterial[i].length; j++) {
                mediumMaterial[i][j] = ler.nextInt();
            }
        }

        System.out.println("---------------------");

        // Faz a soma das notas
        for (int i = 0; i < mediumMaterial.length; i++) {
            for (int j = 0; j < mediumMaterial[i].length; j++) {
                sum[i] = sum[i] + mediumMaterial[i][j];
            }
        }

        System.out.println("------------------------");
        // Faz as media das notas
        for (int i = 0; i < mediumMaterial.length; i++) {
            for (int j = 0; j < mediumMaterial[i].length; j++) {
                
                average[i] = sum[i] / mediumMaterial[i].length;
            }
            System.out.println(average[i]);
        }

        System.out.println("---");
        // Imprimir média
        for (int i = 0; i < average.length; i++) {
            System.out.println("A média da matéria " + (i + 1) + " é: " + average[i]);
        }
    }
}
