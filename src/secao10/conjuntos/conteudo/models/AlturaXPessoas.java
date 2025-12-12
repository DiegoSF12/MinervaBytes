/*
    Problema Exemplo 01
    Fazer um programa para ler um numero inteiro N e a altura de N pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a altura média dessas pessoas
*/

package secao10.conjuntos.conteudo.models;

import java.util.Scanner;
import java.util.Locale;

public class AlturaXPessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int tamanho;
        double[] alturas;
        double media = 0;
        
        System.out.print("Por favor, informe a quantidade de pessoas presentes: ");
        tamanho = sc.nextInt();
        alturas = new double[tamanho];
        for (int i = 0; i < alturas.length; i++) {
            System.out.printf("Informe a altura da %dº pessoa: ", (i + 1));
            alturas[i] = sc.nextDouble();
            media += alturas[i];
        }
        System.out.printf("A media de altura de todos os presentes é igual a: %.2f", (media / alturas.length));
        sc.close();
    }
}
