package Biblioteca.entities;

import java.util.Scanner;
import java.util.ArrayList;

public class MenuLivro {
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList<>();
        int op = -1;
        while(op != 5){

            System.out.println(" ===== Bem vindo a Biblioteca Municipal, veja abaixo as opções diponiveis ===== ");
            System.out.println("1 - Cadastrar livro\n2 - Listar livros\n3 - Emprestar livro\n4 - Devolver livro\n5 - Sair");
            System.out.print("Digite a opção desejada: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    Livro.cadastrarLivros(sc, livros);
                    System.out.println("==================================\n\n");
                    break;
                case 2:
                    Livro.listarLivros(livros);
                    System.out.println("==================================\n\n");
                    break;
                case 3:
                    Livro.emprestarLivro(sc, livros);
                    System.out.println("==================================\n\n");
                    break;
                case 4:
                    Livro.devolverLivro(sc, livros);
                    System.out.println("==================================\n\n");
                    break;
                case 5:
                    System.out.println(" ===== Sessão Encerradada. Volte sempre!! =====");
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
