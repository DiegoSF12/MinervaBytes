/*
    Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em
Fahrenheit. Perguntar se o usuário deseja repetir (s/n). Caso o usuário digite "s", repetir o
programa.
*/
package secao6.estruturasRepetitivas.conteudo;

import java.util.Scanner;

public class ProblemaExemplo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        String op;

        do{
            System.out.print("Digite a temperatura em °C: ");
            celsius = sc.nextDouble();
            fahrenheit = (9 * celsius) / 5 + 32;
            System.out.printf("Equivalente em °F: %.2f\n",fahrenheit);
            System.out.println("Deseja repetir (S/N) ?");
            sc.nextLine();
            op = sc.nextLine();
        }while(op.equals("S")  || op.equals("s"));
        sc.close();
    }
}
