package exercicios.II.estoque;

public class Produtos {
    private String nome;
    private double preco;
    private int quantidade;

    public Produtos(){

    }
    public Produtos(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public double getPreco(){
        return this.preco;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
     @Override
    public String toString(){
        return String.format("Nome: %s\nPreço: %.2f\nQuantidade: %d\n", this.getNome(),this.getPreco(),this.getQuantidade());
    }

}
