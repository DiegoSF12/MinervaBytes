package secao7.introducaoClasses.atividades.test;

import secao7.introducaoClasses.atividades.models.Exercicio02;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio02Test {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Exercicio02 pessoa01 = new Exercicio02();
        Scanner sc = new Scanner(System.in);
        pessoa01.instaciarObjeto(sc);

    }
}
