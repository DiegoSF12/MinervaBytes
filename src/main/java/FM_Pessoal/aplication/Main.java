package FM_Pessoal.aplication;

import FM_Pessoal.entitites.Usuario;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome de usuário");
        String nomeUser = sc.nextLine();
        Usuario user = new Usuario(nomeUser);
        



    }
}