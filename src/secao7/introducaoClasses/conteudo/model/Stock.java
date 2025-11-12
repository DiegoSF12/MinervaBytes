/*  Fazer um programa para ler os dados de um produto em estoque (nome, preço e
quantidade no estoque). Em seguida:
    • Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no
estoque)
    • Realizar uma entrada no estoque e mostrar novamente os dados do produto
    • Realizar uma saída no estoque e mostrar novamente os dados do produto
*/
package secao7.introducaoClasses.conteudo.model;

import java.util.Scanner;

public class Stock {
    private String name;
    private double price;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void createProduct(Scanner sc){
        System.out.println("Por favor, informe o nome do produto: ");
        this.setName(sc.nextLine());
        System.out.println("Agora o valor unitario: ");
        this.setPrice(sc.nextDouble());
        System.out.println("E por fim, a quantidade que esta sendo inserida: ");
        this.setQuantity(sc.nextInt());
    }
    public void addProduct(Scanner sc){
        int quantity;
        System.out.println("Informe a quantidade de reabastecimento: ");
        sc.nextLine();
        quantity = sc.nextInt();
        this.setQuantity(this.getQuantity() + quantity);
        System.out.println("Informaçõe atualizadas");
        System.out.printf("Nome Produto: %s\nPreço Unitario: %.2f\nValor total em estoque: %.2f\nQuantidade em estoque: %d", this.getName(), this.getPrice(),(this.getQuantity() * this.getPrice() ), this.getQuantity());
    }
    public void removeProduct(Scanner sc){
        int newQuantity;
        System.out.println("\nInforme a quantidade que esta sendo retirada em estoque: ");
        newQuantity = sc.nextInt();
        if(newQuantity > this.getQuantity()){
            System.out.println("A quantidade informada é maior que a disponivel em estoque");
        }
        else{
            this.setQuantity(this.getQuantity() - newQuantity);
            System.out.println("Informaçõe atualizadas");
            System.out.printf("Nome Produto: %s\nPreço Unitario: %.2f\nQuantidade em estoque: %d", this.getName(), this.getPrice(), this.getQuantity());
        }
    }
    double valorTeste = Float.MAX_VALUE;
    public String toString(){
        return "Teste toString()" + " concatenado " + this.name + "\n" + String.format("%.3f", valorTeste);
    }
}
