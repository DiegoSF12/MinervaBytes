/*
Fazer um programa que lê números
inteiros até que um zero seja lido. Ao
final mostra a soma dos números lidos
*/
package secao6.estruturasRepetitivas.conteudo;

import java.util.Scanner;

public class ProblemaExemplo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int soma = 0;

        System.out.println("Por favor, digite um numero qualquer ou 0 para parar");
        numero = sc.nextInt();
        while(numero != 0){
            soma += numero;
            System.out.println("Digite o proximo numero");
            numero = sc.nextInt();
        }
        System.out.printf("A soma de todos os numeros informados é: %d",soma);
        sc.close();
    }
}
