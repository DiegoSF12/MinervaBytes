package exercicios.II.estoque;

import java.util.Scanner;
import java.util.ArrayList;


public class Methods {
    public static void addProduto(Scanner sc, ArrayList<Produtos> produtos) {
        System.out.println("___________________________________________________");
        System.out.println();
        System.out.println();
        sc.nextLine();
        System.out.print("Informe o nome do produto: ");
        String nome = sc.nextLine();
        System.out.print("Agora informe o preço: ");
        double preco = sc.nextDouble();
        System.out.print("E por fim, a quantidade de produtos adicionados: ");
        int quantidade = sc.nextInt();
        produtos.add(new Produtos(nome, preco, quantidade));
        System.out.printf("Produto %s adicionado com sucesso!", nome);
    }

    public static void findProduto(Scanner sc, ArrayList<Produtos> produtos) {
        boolean loop = true;
        while (loop) {
            System.out.println("___________________________________________________");
            System.out.println();
            System.out.println();
            sc.nextLine();
            System.out.print("Infome o nome do produto para realizar a busca: ");
            String find = sc.nextLine();
            Produtos findProduct = null;
            for (Produtos x : produtos) {
                if (x.getNome().equals(find)) {
                    findProduct = x;
                    break;
                }
                if (findProduct != null) {
                    System.out.println("___________________________________________________");
                    System.out.println("\n\nProduto encontrado");
                    System.out.println(findProduct);
                    System.out.println("___________________________________________________");
                    loop = false;
                } else {
                    System.out.println("\n\n___________________________________________________");
                    System.out.println("Produto não encontrado, deseja fazer outra busca ? (S/N)");
                    String opt = sc.nextLine().toUpperCase();
                    if (!(opt.equals("S"))) {
                        loop = false;
                        System.out.println();
                        System.out.println("Saindo da busca...");
                    }
                }
            }
        }
    }
}
