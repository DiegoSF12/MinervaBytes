package secao12.enumeracaoComposicao.atividades.models;

public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price){
        this.name = name;
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setPrice(Double price){
        this.price = price;
    }
    public Double getPrice(){
        return this.price;
    }

}
