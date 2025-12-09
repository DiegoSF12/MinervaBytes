/*
    Problema exemplo 02
    Fazer um programa para ler um número inteiro N e os dados(nome e preço) de N produtos. Armazene os N produtos em um vetor. Em seguida, mostrar o preço médios dos produtos.
*/
package secao10.arrays.conteudo.models;

public class Produtos {
    String nomeProduto;
    double precoProduto;

    public Produtos(String nomeProduto, double precoProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }
    
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getNomeProduto() {
        return this.nomeProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }
    
    public double getPrecoProduto() {
        return this.precoProduto;
    }

}
