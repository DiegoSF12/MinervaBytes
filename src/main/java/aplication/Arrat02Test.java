package aplication;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Locale;

public class Arrat02Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int tamanho;
        double media = 0;

        System.out.print("Qual o tamanho da lista? ");
        tamanho = sc.nextInt();
        sc.nextLine();
        Array02[] products = new Array02[tamanho];

        for (int i = 0; i < products.length; i++) {
            System.out.print("Digite o nome do produto: ");
            products[i] = new Array02();
            products[i].setProductName(sc.nextLine());
            System.out.print("Digite o valor do produto: ");
            products[i].setProductPrice(sc.nextDouble());
            sc.nextLine();
            media += products[i].getProductPrice();
            if (i == products.length - 1) {
                for (int j = 0; j < products.length; j++) {
                    System.out.println("-----------------------");
                    System.out.printf("Nome: %s\nPreço: %.2f\n", products[j].getProductName(), products[j].getProductPrice());
                    System.out.println("-----------------------");
                }
            }
        }
        media = media / products.length;
        System.out.printf("A média dos preços é igual a: %.2f",media);
    }
}
