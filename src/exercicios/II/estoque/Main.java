package exercicios.II.estoque;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Produtos> produtos = new ArrayList<>();
        int opt = -1;
        while(true){
            System.out.println("###################################################");
            System.out.println("Bem vindo ao menu, escolha uma das opções a baixo: ");
            System.out.println("___________________________________________________");
            System.out.println("1 - Adicionar Produtos");
            System.out.println("2 - Buscar Produtos");
            System.out.println("3 - Remover Produtos");
            System.out.println("0 - SAIR");
            System.out.println("___________________________________________________");
            System.out.println("###################################################");

            System.out.print("Opção: ");
            opt = sc.nextInt();

            switch(opt){
                case 1:
                    Methods.addProduto(sc,produtos);
                break;
                case 2:
                    Methods.findProduto(sc, produtos);
                break;
                case 3:
                break;
                case 0:
                    System.exit(0);
                break;
            }
         }
     }
}
