/*
    Conversor de Salário:
    Desenvolva um programa que pergunte quanto um funcionário ganha por hora e o número de horas trabalhadas no mês.
    Calcule e mostre o total do seu salário no referido mês.
*/
package exercicios.I;
import java.util.Scanner;
import java.util.Locale;

public class ConversoSalario {
    public static void main(String[] args) {
        String nome, matricula;
        double valorHora, salario;
        int horasTrabalhadas;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, informe o seu nome: ");
        nome = sc.nextLine();
        System.out.print("Agora a sua matricula: ");
        matricula = sc.nextLine();
        System.out.printf("%s, pressione ENTER para continuar...", nome);
        sc.nextLine();
        System.out.println("\nQual o valor de sua hora trabalhada? ");
        valorHora = sc.nextDouble();
        System.out.println("Quantas horas você trabalho nesse mês? ");
        horasTrabalhadas = sc.nextInt();
        salario = horasTrabalhadas * valorHora;

        System.out.println("Ficha do funcionario");
        System.out.printf("Nome: %s\nMatricula: %s\nHoras trabalhadas: %d\nValor da hora: %.2f\nSalario: %.2f\n",nome,matricula,horasTrabalhadas,valorHora,salario);
    }

}
