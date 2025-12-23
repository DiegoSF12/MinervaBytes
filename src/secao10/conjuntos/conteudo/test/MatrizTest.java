package secao10.conjuntos.conteudo.test;

import java.util.Scanner;

public class MatrizTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor da matriz: ");
        int tamanho = sc.nextInt();
        int[][] matriz = new int[tamanho][tamanho];
        
        //Leitura dos valores
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.printf("Informe o valor %d da linha %d: ",(j + 1), (i + 1));
                matriz[i][j] = sc.nextInt();
            }
        }

        //Mostrando valores
        for(int i = 0; i < matriz.length; i++){
            System.out.println("--------------");
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print("| " + matriz[i][j]);
                if(j == tamanho - 1){
                    System.out.println();
                }
            }
        }

        //Mostrando os valores na diagonal
        System.out.println("Diagonal principal");
        for(int i = 0; i < matriz.length; i++){
            System.out.println(matriz[i][i]);
        }

        System.out.println("Valores negativos");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(matriz[i][j] < 0){
                    System.out.println(matriz[i][j]);
                }
            }
        }
        sc.close();
    }
}
