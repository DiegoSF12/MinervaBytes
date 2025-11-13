package secao7.introducaoClasses.conteudo.test;

import secao7.introducaoClasses.conteudo.model.Circunference;
import java.util.Scanner;
import java.util.Locale;

public class CircunferenceTest {
    public static void main(String[] args) {
        double valor;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o valor: ");
        valor = sc.nextDouble();
        Circunference.circunferencia(valor);
        Circunference.volumeEsfera(valor);
        System.out.printf("Valor de PI: %.2f", Math.PI);
        sc.close();
    }
}
