package Biblioteca.entities;

import java.util.Scanner;
import java.util.ArrayList;
import Biblioteca.entities.Livro;

public class MenuLivro {
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList<>();
        int op = -1;
        while(op != 5){
            System.out.println("Bem vindo a Biblioteca Municipal, veja abaixo as opções diponiveis: ");
            System.out.println("1 - Cadastrar livro\n2 - Listar livros\n3 - Emprestar livro\n4 - Devolver livro\n5 - Sair");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    Livro.cadastrarLivros(sc, livros);
                    break;
                case 2:
                    Livro.listarLivros(livros);
                    break;
                case 3:
                    Livro.emprestarLivro(sc, livros);
                    break;
                case 4:
                    Livro.devolverLivro(sc, livros);
                    break;
                default:
                    System.out.println("Opção invalida, escolha uma das disponiveis abaixo: ");
                    System.out.println("1 - Cadastrar livro\n2 - Listar livros\n3 - Emprestar livro\n4 - Devolver livro\n5 - Sair");
                    op = sc.nextInt();
                    break;
            }
        }

    }
}
