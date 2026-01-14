package Biblioteca.test;

import Biblioteca.entities.Livro;
import java.util.ArrayList;
import java.util.Scanner;

public class LivrosTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList<>();
        Livro.cadastrarLivros(sc, livros);
        Livro.listarLivros(livros);
        Livro.emprestarLivro(sc, livros);
        Livro.emprestarLivro(sc, livros);
        Livro.listarLivros(livros);
    }
}