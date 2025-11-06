/*
    Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.
*/
package secao5.estruturasCondicionais.atividades;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroA, numeroB;
        boolean multiplo = false;

        System.out.print("Digite o primeiro valor: ");
        numeroA = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        numeroB = sc.nextInt();

        if(numeroA > numeroB){
            if(numeroA % numeroB == 0) {
                multiplo = true;
            }
        }
        else{
            if(numeroB % numeroA == 0){
                multiplo = true;
            }
        }
        if(multiplo){
            System.out.println("Os valores informados são multiplos");
        }
        else{
            System.out.println("Os valores não são multiplos");
        }
        sc.close();
    }
}
