package secao10.conjuntos.conteudo.test;

import secao10.conjuntos.conteudo.models.Produtos;
import java.util.*;

public class ProdutoTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Produtos[] listaProdutos;
        int quantidade;
        double mediaPrecos = 0 , preco;
        String nome;

        System.out.println("Quantos produtos você deseja adicionar a sua lista ?");
        quantidade = sc.nextInt();
        listaProdutos = new Produtos[quantidade];
        for (int i = 0; i < listaProdutos.length; i++) {
            sc.nextLine();
            System.out.print("Digite o nome do prooduto: ");
            nome = sc.nextLine();
            System.out.print("Agora o valor: ");
            preco = sc.nextDouble();
            listaProdutos[i] = new Produtos(nome, preco);
            mediaPrecos += listaProdutos[i].getPrecoProduto(); 
        }
        System.out.printf("O valor médio da sua lista de compras foi: R$%.2f", (mediaPrecos / listaProdutos.length));
    }
}
