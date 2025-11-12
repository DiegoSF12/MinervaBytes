/*
    Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
    seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
    salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
    afetado pela porcentagem) e mostrar novamente os dados do funcionário.
*/

package secao7.introducaoClasses.atividades.models;
import java.util.Scanner;

public class Exercicio02 {
    private String name;
    private double grossSalary;
    private double tax;

    public Exercicio02() {

    }

    public Exercicio02(String name, double tax, double grossSalary) {
        this.name = name;
        this.tax = tax;
        this.grossSalary = grossSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public void instaciarObjeto(Scanner sc){
        System.out.print("Por favor, informe o seu nome: ");
        this.setName(sc.nextLine());
        System.out.print("Salario Bruto: ");
        this.setGrossSalary(sc.nextDouble());
        System.out.print("Valor da taxa: ");
        this.setTax(sc.nextDouble());
        System.out.printf("Funcionario: %s\nSalario Liquido: %.2f\n", this.getName(), (this.getGrossSalary() - this.getTax()));
        this.aumentarSalario(sc);


    }
    public void aumentarSalario(Scanner sc){
        double porcentagem;
        System.out.print("Digite a porcentagem a ser acrescida: ");
        porcentagem = sc.nextDouble();
        System.out.printf("O salario com %.2f de acrescimo é R$ %.2f",porcentagem, (((grossSalary * porcentagem) / 100) + (grossSalary - tax)));
    }


}
