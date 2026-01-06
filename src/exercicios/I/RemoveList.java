/*
    Exercício 4 – Removendo elementos
    Crie um programa que:

Crie um ArrayList<String> com nomes de cidades

Mostre a lista completa

Remova uma cidade específica pelo nome

Mostre a lista novamente após a remoção

Método importante:
remove("nome")

Objetivo:
Entender como remover elementos e perceber como a lista se reorganiza.
*/
package exercicios.I;

import java.util.ArrayList;

public class RemoveList {
    public static void main(String[] args) {
        ArrayList<String> cidades = new ArrayList<>();

        cidades.add("Patrocinio");
        cidades.add("Uberaba");
        cidades.add("São Paulo");
        cidades.add("Gramados");
        cidades.add("Rio de Janeiro");

        System.out.println("\nMostrando a lista de cidades completa:");
        for(String cidade : cidades){
            System.out.println(cidade);
        }
        int lastIndex = cidades.size() - 1;
        cidades.remove(lastIndex);
        System.out.println("\n\nLista de cidades após uma remoção: ");
        for(String cidade : cidades){
            System.out.println(cidade);
        }
    }
}
