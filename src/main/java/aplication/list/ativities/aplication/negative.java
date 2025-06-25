package aplication.list.ativities.aplication;

import java.util.Scanner;

public class negative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tamanho;

        System.out.println("Quantos numeros você vai digitar?(Min: 1/Max: 10)");
        tamanho = sc.nextInt();
        if(tamanho > 10){
            System.out.println("Valor invalido.");
        }
        int[] numeros = new int[tamanho];
        for(int i = 0; i < numeros.length; i++){
            System.out.printf("Digite o %d° numero: ",i+1);
            numeros[i] = sc.nextInt();
        }
        System.out.println("Numeros Negativos: ");
        for(int i : numeros){
            if(i < 0){
                System.out.println(i);
            }
        }
        System.out.println("Finalizado");
        sc.close();
    }
}
