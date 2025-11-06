/*
    Fazer um programa para ler um valor inteiro de 1 a 7 representando um
dia da semana (sendo 1=domingo, 2=segunda, e assim por diante).
Escrever na tela o dia da semana correspondente, conforme exemplos
*/
package secao5.estruturasCondicionais.conteudo;

import java.util.*;

public class ProblemaExemplo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;

        System.out.println("Entre com um numero de 1 a 7 e veja a opção correspondente");
        op = sc.nextInt();

        switch(op){
            case 1:
                System.out.println("1 - Domingo");
                break;
            case 2:
                System.out.println("2 - Segunda-Feira");
                break;
            case 3:
                System.out.println("3 - Terça-Feira");
                break;
            case 4:
                System.out.println("4 - Quarta-Feira");
                break;
            case 5:
                System.out.println("5 - Quinta-Feira");
                break;
            case 6:
                System.out.println("6 - Sexta-Feira");
                break;
            case 7:
                System.out.println("7 - Sabádo");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        sc.close();

    }
}
