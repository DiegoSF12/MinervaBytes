/*
    Terreno Retangular:
    Crie um programa que leia a largura e o comprimento de um terreno retangular.
    Calcule e mostre a área total (largura * comprimento) e o perímetro (2 * largura + 2 * comprimento) do terreno.
*/

package exercicios.I;

import java.util.Locale;
import java.util.Scanner;

public class TerrenoRetangular {
    public static void main(String[] args) {
        double largura, comprimento, area, perimetro;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, informe a largura do terreno em metros: ");
        largura = sc.nextDouble();
        System.out.print("Agora informe o comprimento: ");
        comprimento = sc.nextDouble();

        area = largura * comprimento;
        perimetro = 2 * largura + 2 * comprimento;

        System.out.println("Informações do Terreno");
        System.out.printf("Largura: %.2f m\nComprimento: %.2f m\nArea: %.2f m²\nPerimetro: %.2f m",largura, comprimento, area, perimetro);

        sc.close();
    }
}
