package src;

import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {
      
        Scanner ler = new Scanner(System.in);

        int[] valores = lerValores(ler);
        int[][] mat =  matriz(valores, ler);
        imprimirVetor(mat, valores);
        
        
    }

    public static int[] lerValores(Scanner ler) {
        
        System.out.println("Informe o numer de colunas: ");
        int lin = ler.nextInt();
        
        System.out.println("Informe o número de colunas: ");
        int col = ler.nextInt();
        
        int[] valores = {lin,col};

        return valores;

    }

    public static int[][] matriz (int valores[], Scanner ler) {
        
        int mat[][] = new int[valores[0]][valores[1]];

        System.out.println("Preenche matriz ->");

        for(int i = 0; i < valores[0]; i ++){
            for(int j = 0; j < valores[1]; j ++){
                System.out.println("Matriz[" + i +"[" + j + "] = ");
                mat[i][j] = ler.nextInt();
            }
        }

        return mat;
        
    }

    public static void imprimirVetor(int[][] mat, int[] valores) {
        
        for(int i = 0; i < valores[0]; i ++){
            for(int j = 0 ; j < valores[1]; j ++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
