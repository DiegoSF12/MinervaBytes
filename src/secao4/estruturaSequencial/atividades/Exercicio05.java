/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
*/
package secao4.estruturaSequencial.atividades;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigoPeca, quantidadePecas;
        double valorPeca;

        int codigoPeca02, quantidadePecas02;
        double valorPeca02;

        double valorPagar;
        
        System.out.print("Por faovor, informe o código da peça: ");
        codigoPeca = sc.nextInt();
        System.out.print("Agora informe o numero de peças compradas: ");
        quantidadePecas = sc.nextInt();
        System.out.print("E o valor unitário de cada peça: ");
        valorPeca = sc.nextDouble();

        System.out.println("Agora infome as informações da segunda peça");
        System.out.print("Por faovor, informe o código da peça: ");
        codigoPeca02 = sc.nextInt();
        System.out.print("Agora informe o numero de peças compradas: ");
        quantidadePecas02 = sc.nextInt();
        System.out.print("E o valor unitário de cada peça: ");
        valorPeca02 = sc.nextDouble();

        valorPagar = (quantidadePecas * valorPeca) + (quantidadePecas02 * valorPeca02);

        System.out.println();
        System.out.printf("Valor a ser pago pela peça %d R$ %.2f\n",codigoPeca, (quantidadePecas * valorPeca));
        System.out.printf("Valor a ser pago pelas peças %d R$ %.2f\n",codigoPeca02, (quantidadePecas02 * valorPeca02));
        System.out.printf("Valor total a ser pago R$ %.2f", valorPagar);

        sc.close();
    }
}