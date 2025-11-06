//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
package secao5.estruturasCondicionais.atividades;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero;
        System.out.print("Por favor, informe um número: ");
        numero = sc.nextInt();

        if(!(numero < 0)){
            System.out.println("O numero informado é um numero POSITIVO");
        }
        else{
            System.out.println("O numero informado é um numero NEGATIVO");
        }
        sc.close();
    }
}
