/*
    Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.
 */

package secao4.estruturaSequencial.atividades;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero01, numero02, resultado;

        System.out.println("Bem vindo ao incio do programa, por favor, insira o primeiro numero da soma");
        numero01 = sc.nextInt();

        System.out.println("Agora digite o segundo valor");
        numero02 = sc.nextInt();

        resultado = numero01 + numero02;

        System.out.printf("A soma dos valores informado é igual a: %d", resultado);

        sc.close();
    }
}
