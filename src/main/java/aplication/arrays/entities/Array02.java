package aplication.arrays.entities;

public class Array02 {
    private String productName;
    private double productPrice;

    public Array02(){

    }
    public Array02(String productName, double productPrice){
        this.productName = productName;
        this.productPrice = productPrice;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }

    public void setProductPrice(double productPrice){
        this.productPrice = productPrice;
    }

    public String getProductName(){
        return this.productName;
    }

    public double getProductPrice(){
        return this.productPrice;
    }
}
