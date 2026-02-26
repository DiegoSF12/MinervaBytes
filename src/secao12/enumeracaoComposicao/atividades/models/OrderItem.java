package secao12.enumeracaoComposicao.atividades.models;

public class OrderItem {
    private Integer quantity;
    private Double price;
    private Product product;

    public OrderItem(Integer quantity, Double price, Product product){
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public void setQuantidade(Integer quantity){
        this.quantity = quantity;
    }

    public Integer getQuantity(){
        return this.quantity;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public Double getPrice(){
        return this.price;
    }

    public void setProduct(Product product){
        this.product = product;
    }

    public Product geProduct(){
        return this.product;
    }

    //TO DO
    //public Double subTotal(){
    //    return
    //}

    
}
