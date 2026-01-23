package Biblioteca.entities;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

public class Livro{
    private String titulo;
    private String autor;
    private Boolean status;

    public Livro(){

    }
    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        status = true;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public void setStatus(Boolean status){
        this.status = status;
    }
    public Boolean getStatus(){
        return this.status;
    }
    @Override
    public String toString(){
        String statusFinal;
        if(this.status == true){
            statusFinal = "Disponivel";
        }
        else{
            statusFinal = "Indisponivel";
        }
        return String.format("Titulo: %s\nAutor: %s\nStatus: %s", this.getTitulo(),this.getAutor(),statusFinal);
    }
    public static void cadastrarLivros(Scanner sc, ArrayList<Livro> livros){
        String autor;
        String titulo;
        System.out.print("Digite o titulo do livro: ");
        titulo = sc.nextLine();
        System.out.print("Agora o autor da obra: ");
        autor = sc.nextLine();
        livros.add(new Livro(titulo, autor));
    }
    public static void listarLivros(ArrayList<Livro> livros){
        System.out.println("Lista de livros cadastrados");
        for(int i = 0; i < livros.size(); i++){
            System.out.println("===========================");
            System.out.println(livros.get(i) + "\n" + "Indice: "+(i + 1));
            System.out.println("===========================");
        }
    }
    public static void emprestarLivro(Scanner sc, ArrayList<Livro> livros){
        System.out.print("Por favor, informe o codigo do livro que deseja: ");
        int index = sc.nextInt() - 1;
        sc.nextLine();
        while(index < 0 && index > livros.size()){
            System.out.println("O indice informado esta incorreto");
            System.out.print("Informe um indice valido: ");
            index = sc.nextInt() - 1;
            sc.nextLine();
        }
        while(livros.get(index).getStatus() == false){
                System.out.println("O Livro selecionado ja se encontra em situação de emprestimo");
                System.out.print("Digite 1 para selecionar outro livro ou 0 para sair");
                int op = sc.nextInt();
                sc.nextLine();
                if(op == 0){
                    break;
                }
                System.out.println("Digite o indice do livro");
                int indexAux = sc.nextInt();
                sc.nextLine();
                while(indexAux < 0 || indexAux > livros.size()){
                    System.out.println("O valor esta fora do escopo da lista");
                    System.out.print("Informe um indice valido: ");
                    indexAux = sc.nextInt();
                }
                index = indexAux - 1;
            }
        livros.get(index).setStatus(false);
    }
    public static void devolverLivro(Scanner sc, ArrayList<Livro> livros){
        sc.nextLine();
        sc.nextLine();
        boolean exist = false;
        int auxIndex = -1;
        System.out.print("Por favor, informe o titulo do livro que será devolvido: ");
        String auxTitulo = sc.nextLine();
        sc.nextLine();
        for(int i = 0; i < livros.size(); i++){
            if(livros.get(i).getTitulo().equals(auxTitulo)){
                if(livros.get(i).getStatus() == false){
                    exist = true;
                    auxIndex = i;
                }
            }
        }
         if(exist == true && auxIndex >= 0){
                livros.get(auxIndex).setStatus(true);
        }else{
            System.out.println("Livro não encontrado ou ja emprestado");
        }
        
    }
}