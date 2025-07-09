package FM_Pessoal.aplication;

import FM_Pessoal.entitites.Album;
import FM_Pessoal.entitites.Generos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite o nome do album: ");
        String nomeAlbum = sc.nextLine();
        System.out.print("Agora digite o nome do artista ou banda: ");
        String nomeArtista = sc.nextLine();
        System.out.print("Agora digite o ano de lançamento: ");
        int anoLancamento = sc.nextInt();
        sc.nextLine();
        System.out.print("Agora escolha um dos generos disponiveis: ");
        for (Generos g : Generos.values()){
            System.out.printf(" - %s -",g);
        }
        String gen = sc.nextLine().toUpperCase();
        Generos gen01 = Generos.valueOf(gen);


        Album alb01 = new Album(nomeAlbum, nomeArtista, anoLancamento, gen01);
        System.out.println(alb01);


        sc.close();
    }
}
