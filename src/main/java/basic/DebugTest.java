package basic;

import java.util.Locale;
import java.util.Scanner;

public class DebugTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double metroQuadrado = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.printf("Area = %.2f\n", area);
        System.out.printf("Preco = R$%.2f", preco);

        sc.close();
    }
}
