package secao10.conjuntos.atividades.models;

public class Funcionario01 {
    private String name;
    private Integer id;
    private Double salary;

    public Funcionario01(){

    }
    public Funcionario01(String name, Integer id, Double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public Integer getId(){
        return this.id;
    }
    public Double getSalary(){
        return this.salary;
    }
    public void increaseSalary(double percentage){
        this.salary = ((salary * percentage) / 100 + salary);
    }

}
