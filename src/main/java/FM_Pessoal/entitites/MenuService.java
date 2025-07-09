package FM_Pessoal.entitites;

import java.util.Scanner;

public class MenuService {

    public static void executar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, digite o seu nome: ");
        String nomeTemp = sc.nextLine();
        Usuario user = new Usuario(nomeTemp);
        int op = 1;
        do {
            System.out.printf("\n%s, seja bem vindo ao menu de opções, veja a baixo o que pode ser feito\n", user.getNome());
            System.out.println("1 - Adicionar um album");
            System.out.println("2 - Listar albuns");
            System.out.println("0 - Sair");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    System.out.print("Digite o nome do album: ");
                    String nomeAlbum = sc.nextLine();
                    System.out.print("Agora digite o nome do artista ou banda: ");
                    String nomeArtista = sc.nextLine();
                    System.out.print("Agora digite o ano de lançamento: ");
                    int anoLancamento = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Agora escolha um dos generos disponiveis: ");
                    for (Generos g : Generos.values()) {
                        System.out.printf(" - %s -", g);
                    }
                    String gen = sc.nextLine().toUpperCase();
                    Generos gen01 = Generos.valueOf(gen);

                    Album album01 = new Album(nomeAlbum, nomeArtista, anoLancamento, gen01);
                    user.adicionarAlbum(album01);
                    break;
                case 2:
                    user.listarAlbuns();
                    break;
                default:
                    System.out.println("Opção invalida, escolha somente uma das três disponiveis");
                    break;
            }
        } while (op != 0);
        sc.close();
    }
}

