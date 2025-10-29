/*
     Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
 */

package secao4.estruturaSequencial.atividades;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome;
        double numeroHoras, valorHora, salario;

        System.out.println("Olá, seja bem vindo ao sistema de calculo salarial, informe o seu nome");
        nome = sc.nextLine();
        sc.nextLine();
        System.out.println("Agora a quantidade de horas trabalhadas");
        numeroHoras = sc.nextDouble();
        System.out.println("Agora o valor por hora");
        valorHora = sc.nextDouble();

        salario = numeroHoras * valorHora;
        System.out.printf("Nome Funcionario: %s\nHoras trabalhadas: %.2f\nValor da hora trabalhada: %.2f\nSalario Relativo: %.2f", nome, numeroHoras, valorHora, salario);
    }
}
