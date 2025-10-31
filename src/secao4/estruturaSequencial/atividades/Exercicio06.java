/*
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
*/
package secao4.estruturaSequencial.atividades;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C;
        double area01, area02, area03, area04, area05;

        System.out.println("Infome três valores");
        System.out.print("Primeiro valor: ");
        A = sc.nextDouble();
        System.out.print("O segundo valorl: ");
        B = sc.nextDouble();
        System.out.print("Agora o terceiro valor: ");
        C = sc.nextDouble();

        //Calcular area do triângulo retângulo
        area01 = (A * C) / 2;
        //Calcular area do circulo
        area02 = Math.PI * Math.pow(C, 2);
        //Calcular area do trapezio
        area03 = ((A + B) * C) / 2;
        //Calcular area do quadrado
        area04 = Math.pow(B, 2);
        //Calcular area do retângulo
        area05 = A * B;

        System.out.printf("A area do triagulo é: %.2f\n",area01);
        System.out.printf("A area dp circulo: %.2f\n", area02);
        System.out.printf("A area do trapezio é: %.2f\n", area03);
        System.out.printf("A area do quadrado é: %.2f\n", area04);
        System.out.printf("A area do retângulo é: %.2f\n", area05);

        sc.close();

    }
}
