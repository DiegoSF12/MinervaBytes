/*
    Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
*/
package secao5.estruturasCondicionais.atividades;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        System.out.println("Digite um numero qualquer");
        numero = sc.nextInt();

       if(numero >= 0 && numero < 25){
           System.out.printf("O valor %d se encontra entre os intervalos de [0..25]",numero);
       }
       else if(numero > 25 && numero < 50){
           System.out.printf("O valor %d se encontra entre os intervalos de [25..50]",numero);
       }
       else if(numero > 50 && numero < 75){
           System.out.printf("O valor %d se encontra entre os intervalos de [50..75]",numero);
       }
       else if(numero > 75 && numero <= 100){
           System.out.printf("O valor %d se encontra entre os intervalos de [75..100]",numero);
       }
       else{
           System.out.println("Fora do intervalo");
       }
        sc.close();
    }
}
