package src.matrizes;

import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {
      
        Scanner ler = new Scanner(System.in);

        int[] valores = lerValores(ler);
        int[][] mat =  matriz(valores, ler);
        imprimirVetor(mat, valores);
        matrizPrincipal(mat,valores);
        
        
    }

    public static int[] lerValores(Scanner ler) {
        
        System.out.println("Informe o número de colunas: ");
        int lin = ler.nextInt();
        
        System.out.println("Informe o número de colunas: ");
        int col = ler.nextInt();
        
        int[] valores = {lin,col};

        return valores;

    }

    public static int[][] matriz (int valores[], Scanner ler) {
        
        int mat[][] = new int[valores[0]][valores[1]];

        System.out.println("Preencha a matriz ->\n");

        for(int i = 0; i < valores[0]; i ++){
            for(int j = 0; j < valores[1]; j ++){
                System.out.print("Matriz[" + i +"[" + j + "] = ");
                mat[i][j] = ler.nextInt();
            }
        }

        return mat;

    }

    public static void imprimirVetor(int[][] mat, int[] valores) {
     
        System.out.println("\nMatriz preenchida:\n");    
        for(int i = 0; i < valores[0]; i ++){
            for(int j = 0 ; j < valores[1]; j ++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void matrizPrincipal(int mat[][], int valores[]){
        System.out.println("Matriz principal: ");            
        
        for(int i = 0; i < valores[0]; i ++){
            for(int j = 0; j < valores[1]; j ++){
                if(i == j){
                    System.out.print(mat[i][j] + " - ");
                }
            }
        }
    }
}
