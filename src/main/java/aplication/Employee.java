package aplication;

import java.util.Scanner;
import java.util.Locale;

public class Employee {
    private String name;
    private double groosSalary;
    private double tax;

    public double netSalary(){
        return groosSalary - tax;
    }
    public void increaseSalary (double percentage){
        groosSalary += (groosSalary * percentage) / 100;
    }
    public String toString(){
        return name + ", $" +String.format("%.2f",this.netSalary());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroosSalary(double groosSalary) {
        this.groosSalary = groosSalary;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
}
