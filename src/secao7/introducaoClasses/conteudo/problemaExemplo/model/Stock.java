/*  Fazer um programa para ler os dados de um produto em estoque (nome, preço e
quantidade no estoque). Em seguida:
    • Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no
estoque)
    • Realizar uma entrada no estoque e mostrar novamente os dados do produto
    • Realizar uma saída no estoque e mostrar novamente os dados do produto
*/
package secao7.introducaoClasses.conteudo.problemaExemplo.model;

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
    public void createProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, informe o nome do produto: ");
        this.setName(sc.nextLine());
        System.out.println("Agora o valor unitario: ");
        this.setPrice(sc.nextDouble());
        System.out.println("E por fim, a quantidade que esta sendo inserida: ");
        this.setQuantity(sc.nextInt());
        sc.close();
    }
    public void addProduct(){
        Scanner sc = new Scanner(System.in);
        int quantity;
        System.out.println("Informe a quantidade que esta sendo inserida em estoque: ");
        sc.nextLine();
        quantity = sc.nextInt();
        this.setQuantity(this.getQuantity() + quantity);
        System.out.println("Informaçõe atualizadas");
        System.out.printf("Nome Produto: %s\nPreço Unitario: %.2f\nQuantidade em estoque: %d", this.getName(), this.getPrice(), this.getQuantity());
        sc.close();
    }
    public void removeProduct(){
        Scanner sc = new Scanner(System.in);
        int newQuantity;
        System.out.println("Informe a quantidade que esta sendo retirada em estoque: ");
        quantity = sc.nextInt();
        if(quantity > this.getQuantity()){
            System.out.println("A quantidade informada é maior que a disponivel em estoque");
        }
        else{
            this.setQuantity(this.getQuantity() + quantity);
            System.out.println("Informaçõe atualizadas");
            System.out.printf("Nome Produto: %s\nPreço Unitario: %.2f\nQuantidade em estoque: %d", this.getName(), this.getPrice(), this.getQuantity());
        }
        sc.close();
    }
}
