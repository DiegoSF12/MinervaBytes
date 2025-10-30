/*
    Fazer um programa que lê um valor
inteiro N e depois N números inteiros.
Ao final, mostra a soma dos N números
lidos
*/
package secao6.estruturasRepetitivas.conteudo;

import java.util.Scanner;

public class ProblemaExemplo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros;
        int soma = 0, count;

        System.out.print("Digite o numero de vezes que o laço se repetirá: ");
        count = sc.nextInt();

        for(int i = 0; i < count; i++){
            System.out.print("Digite um numero qualquer: ");
            numeros = sc.nextInt();
            soma += numeros;
        }
        System.out.printf("A soma dos numeros informados é: %d", soma);
        sc.close();
    }
}
