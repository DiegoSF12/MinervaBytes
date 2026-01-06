/*
    Exercício 1 – Criando e exibindo uma lista
    Crie um programa que:
    Crie um ArrayList<String>
    Adicione 5 nomes à lista
    Mostre todos os nomes no console usando um for tradicional

    Objetivo:
    Se acostumar com a criação da lista, uso do add() e acesso com get().
*/

package exercicios.I;

import java.util.List;
import java.util.ArrayList;

public class ListNomes {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<String>();

        nomes.add("Diego");
        nomes.add("Sabrina");
        nomes.add("Sidionor");
        nomes.add("Igor");

        for(int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }
    }
}
