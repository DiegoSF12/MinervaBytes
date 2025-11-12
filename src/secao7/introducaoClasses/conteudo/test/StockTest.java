package secao7.introducaoClasses.conteudo.test;

import secao7.introducaoClasses.conteudo.model.Stock;

import java.util.Scanner;

public class StockTest {
    public static void main(String[] args) {
        Stock produto01 = new Stock();
        Scanner sc = new Scanner(System.in);
        System.out.println(produto01);
        produto01.createProduct(sc);
        produto01.addProduct(sc);
        produto01.removeProduct(sc);
        
    }
}
