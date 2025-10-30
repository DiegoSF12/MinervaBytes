//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
package secao5.estruturasCondicionais.atividades;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        System.out.print("Informe um número: ");
        numero = sc.nextInt();
        if(numero % 2 == 0){
            System.out.println("O número informado é um numero PAR");
        }
        else{
            System.out.println("Esse é um numero IMPAR");
        }
        sc.close();
    }
}
