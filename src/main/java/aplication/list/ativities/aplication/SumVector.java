package aplication.list.ativities.aplication;

import java.util.Scanner;
import java.util.Locale;

public class SumVector {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double soma = 0;
        double media = 0;
        int tamanho;

        System.out.print("Quantos numeros você vai digitar? ");
        tamanho = sc.nextInt();
        double[] valores = new double[tamanho];
        for (int i = 0; i < valores.length; i++) {
            System.out.printf("Digite o %d° numero ", i + 1);
            valores[i] = sc.nextDouble();
            soma = soma + valores[i];        }
        System.out.print("Valores = ");
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i]);
            System.out.print(" ");
        }
        media = soma / valores.length;
        System.out.println();
        System.out.printf("Soma: %.1f\n", soma);
        System.out.printf("Média: %.1f\n", media);
    }
}
