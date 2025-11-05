package secao7.introducaoClasses.conteudo.problemaExemplo.test;

import secao7.introducaoClasses.conteudo.problemaExemplo.model.Stock;

public class StockTest {
    public static void main(String[] args) {
        Stock produto01 = new Stock();
        produto01.createProduct();
        produto01.addProduct();
        produto01.removeProduct();
    }
}
