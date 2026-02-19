package exercicios.I;

import javax.crypto.spec.PSource;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.ArrayList;

public class Pessoas {
    private String nome;
    private int id;
    private LocalDateTime dataCadastro;

    public Pessoas(){

    }
    public Pessoas(String nome, int id){
        this.nome = nome;
        this.id = id;
        this.dataCadastro = LocalDateTime.now();
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return String.format("Nome: %s\nID: %d",this.getNome(), this.getId());
    }
    public static void addPessao(Scanner sc, ArrayList<Pessoas> pessoas){
        System.out.print("Por favor, informe o nome da pessoa: ");
        String nomePessoa = sc.nextLine();
        sc.nextLine();
        System.out.print("Agora informe o numero do ID: ");
        int idPessoa = sc.nextInt();
        pessoas.add(new Pessoas(nomePessoa, idPessoa));
    }
    public static void removePessoa(Scanner sc, ArrayList<Pessoas> pessoas){
        boolean loop = true;
        while(loop){
            System.out.print("Informe a matricula da pessoa a ser buscada: ");
            int findId = sc.nextInt();
            Pessoas findObject = null;
            for(Pessoas x : pessoas) {
                if(x.getId() == findId){
                    findObject = x;
                    break;
                }
            }
            if(findObject != null){
                System.out.println("Pessoa encotrada");
                System.out.println(findObject);
                System.out.println("_________________");
                pessoas.remove(findObject);
                loop = false;
            }
            else{
                System.out.println("Registro não encontrado");
                loop = false;
            }
        }
    }
    public static void listarPessoas(ArrayList<Pessoas> pessoas){
        for(Pessoas x : pessoas){
            System.out.println(x);
        }
    }
}

