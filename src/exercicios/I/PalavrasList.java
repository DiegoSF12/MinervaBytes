/*
    Exercício 5 – Contando palavras
    Crie um programa que:

    Crie um ArrayList<String> com várias palavras

    Conte quantas palavras têm mais de 5 caracteres

    Exiba esse total no console

    Dica:
    Use palavra.length() dentro do for.

    Objetivo:
    Trabalhar com condições (if) enquanto percorre uma lista.
* */
package exercicios.I;

import java.util.ArrayList;

public class PalavrasList {
    public static void main(String[] args) {
        ArrayList<String> palavras = new ArrayList<>();
        int count = 0;

        palavras.add("Resolver");
        palavras.add("Java");
        palavras.add("Spring-Boot");
        palavras.add("Amor");
        palavras.add("Minerva");
        palavras.add("Processador");

        for(int i = 0; i < palavras.size(); i++){
            if(palavras.get(i).length() > 5){
                count += 1;
            }
        }
        System.out.printf("\nA quantidade de palavras que tem mais de 5 caracteres é: %d", count);
    }
}
