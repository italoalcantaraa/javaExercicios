package src;

import java.util.Scanner;

public class exer1 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.err.println("Informe o número de linhas da matriz: ");
        int lin = ler.nextInt();
        
        System.err.println("Informe o número de colunas da matriz: ");
        int col = ler.nextInt();
        
        int mat[][] = new int[lin][col];

        System.out.println("Informe os valores da matriz -> \n");

        for(int i = 0; i < lin; i ++){  
            for(int j = 0; j < col; j++){
                mat[i][j] = ler.nextInt();
            }
        }

        System.out.println("Matriz preenchida: ");

        for(int i = 0; i < lin; i ++){  
            for(int j = 0; j < col; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }
}
