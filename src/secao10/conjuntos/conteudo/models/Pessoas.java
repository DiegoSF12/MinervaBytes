package secao10.conjuntos.conteudo.models;

public class Pessoas {
    private String nome;
    private Integer idade;
    private String email;    

    public Pessoas(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public Pessoas(String nome, Integer idade, String email){
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setIdade(Integer idade){
        this.idade = idade;
    }
    public Integer getIdade(){
        return this.idade;
    }
    public String getEmail(){
        return this.email;
    }
    public String toString(){
        return String.format("Nome: %s\nIdade: %d\nE-mail: %s", this.getNome(), this.getIdade(), this.getEmail());
    }


}

