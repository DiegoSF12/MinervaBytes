/*
    Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
*/
package secao5.estruturasCondicionais.atividades;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo;
        int quantidade;
        double preco = 0;

        System.out.println("CODIGO | ESPECIFICAÇÃO  | PREÇO ");
        System.out.println("---------------------------------");
        System.out.println("1      | Cachorro Quente| R$ 4.00");
        System.out.println("2      | X - Salada     | R$ 4.50");
        System.out.println("3      | X - Bacon      | R$ 5.00");
        System.out.println("4      | Torrada Simples| R$ 2.00");
        System.out.println("5      | Refrigerante   | R$1.50 ");
        System.out.println();
        System.out.print("Qual o seu pedido ? (codigo): ");
        codigo = sc.nextInt();
        System.out.print("E a quantidade ? : ");
        quantidade = sc.nextInt();

        switch (codigo){
            case 1:
                preco = quantidade * 4.00;
                break;
            case 2:
                preco = quantidade * 4.50;
                break;
            case 3:
                preco = quantidade * 5.00;
                break;
            case 4:
                preco = quantidade * 2.00;
                break;
            case 5:
                preco = quantidade * 1.50;
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        System.out.printf("Valor total da compra R$ %.2f",preco);
        sc.close();
    }
}
