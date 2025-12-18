package secao10.conjuntos.atividades.models;

public class Funcionario {
    private Integer ID;
    private String nome;
    private Double salario;

    public Funcionario(String nome, Integer ID, Double salario){
        this.nome = nome;
        this.ID = ID;
        this.salario = salario;
    }
    public Funcionario(){

    }
    public Integer getID() {
        return ID;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getSalario() {
        return salario;
    }
    public void aumentoSalarial(double porcentagem){
        this.salario = this.getSalario() + (this.getSalario() * porcentagem / 100);
    }
    public String toString(){
        return String.format("\nNome: %s\nID: %d\nSalario: %.2f\n",this.getNome(), this.getID(), this.getSalario());

    }
}
