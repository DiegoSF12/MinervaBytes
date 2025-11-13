package secao7.introducaoClasses.atividades.test;

import java.util.Locale;
import java.util.Scanner;
import secao7.introducaoClasses.atividades.models.CurrencyConverter;

public class CurrencyConverterTest {
    public static void main(String[] args) {
        CurrencyConverter cv = new CurrencyConverter();
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        cv.converter(sc);
    }
}
