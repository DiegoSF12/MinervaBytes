/*
    Exercício 2 – Soma de números

Crie um programa que:

Crie um ArrayList<Integer>

Adicione 5 números inteiros

Calcule e exiba a soma de todos os números da lista

Dica:
Use uma variável int soma = 0 e percorra a lista com for.

Objetivo:
Entender como trabalhar com números dentro de uma lista.
*/
package exercicios.I;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class ListNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Integer soma = 0;

        numeros.add(56);
        numeros.add(78);
        numeros.add(23);
        numeros.add(98);
        numeros.add(1);

        for(int i = 0; i < numeros.size(); i++){
            soma += numeros.get(i);
        }

        System.out.printf("O valor contido no conjunto é igual a: %d", soma);
    }
}
