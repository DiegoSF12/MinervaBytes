package aplication.list.ativities.entities;

public class Person {
    private String nome;
    private double altura;
    private int idade;

    public Person(){

    }
    public Person(String nome, int idade, double altura){
        this.altura = altura;
        this.idade = idade;
        this.nome = nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getNome(){
        return this.nome;
    }
    public double getAltura(){
        return this.altura;
    }
    public int getIdade(){
        return this.idade;
    }
    public String toString(){


    }
    public static double averageHeight(Person[] people){
        double media = 0;
        for(Person i : people){
            media += i.getAltura();
        }
        return media / people.length;
    }

}
