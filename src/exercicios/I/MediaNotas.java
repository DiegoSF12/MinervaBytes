/*
    Calculadora de Média:
    Faça um programa que leia o nome de um aluno e as suas três notas (P1, P2, P3). Calcule e exiba a média aritmética simples do aluno.
 */
package exercicios.I;
import java.io.Console;
import java.util.Scanner;
import java.util.Locale;

public class MediaNotas {
    public static void main(String[] args) {
        String nome;
        double P1, P2, P3;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo ao sistema da escola Brilho Maior");
        System.out.print("Para iniciarmos, por favor, informe o seu nome: ");
        nome = sc.nextLine();
        System.out.printf("%s, para que possamos continuar, pressione a tecla ENTER...",nome);
        sc.nextLine();
        System.out.print("Agora informe a sua primeira nota (P1): ");
        P1 = sc.nextDouble();
        System.out.print("Agora informe a sua segunda nota (P2): ");
        P2 = sc.nextDouble();
        System.out.print("E por fim, a ultima nota (P3): ");
        P3 = sc.nextDouble();
        double media = (P1 + P2 + P3) / 3;
        System.out.flush();
        System.out.printf("%s, a sua media anual foi de %.2f pontos", nome, media);
    }
}
