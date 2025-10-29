/*
    Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159
 */

package secao4.estruturaSequencial.atividades;

import java.lang.Math;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double area, raio;

        System.out.println("Esse programa calcula a área de um circulo com base em seu raio");
        System.out.println("Por favor, informe o valor do raio (metade da circunferencia)");
        raio = sc.nextDouble();

        area = Math.PI * Math.pow(raio, 2);

        System.out.printf("A area total do circulo com base no raio de %.2f é = %.3f",raio, area);
        sc.close();
    }
}
