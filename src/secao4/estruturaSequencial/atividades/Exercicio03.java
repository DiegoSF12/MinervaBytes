/*
   Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 */

package secao4.estruturaSequencial.atividades;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, C, D, diferenca;

        System.out.println("Esse programa espera receber 4 valores e informa a diferença entre os produtos");
        System.out.print("Por favor, informe o valor de A: ");
        A = sc.nextInt();
        System.out.print("Agora o valor de B: ");
        B = sc.nextInt();
        System.out.print("Agora o valor de C: ");
        C = sc.nextInt();
        System.out.print("E por fim, o valor de D: ");
        D = sc.nextInt();

        diferenca = (A * B) - (C * D);
        System.out.printf("A diferença dos produtos dos valores informados a cima é = %d", diferenca);


        sc.close();
    }
}
