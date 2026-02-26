package exercicios.I;

import java.util.ArrayList;
import java.util.Scanner;

public class PessoaTesteList {
    public static void main(String[] args) {
        ArrayList<Pessoas> pessoas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Pessoas.addPessao(sc, pessoas);
        Pessoas.addPessao(sc, pessoas);
        Pessoas.listarPessoas(pessoas);
        Pessoas.removePessoa(sc,pessoas);
        Pessoas.listarPessoas(pessoas);
    }
}
