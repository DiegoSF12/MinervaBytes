package secao7.introducaoClasses.conteudo.model;

import java.lang.Math;

public class Circunference {
    public static void circunferencia(double valor){
        double circunferencia = 2 * Math.PI * valor;
        System.out.printf("Circunferencia: %.2f\n", circunferencia);
    }
    public static void volumeEsfera(double valor){
        double volumeEsfera = (4.0 / 3.0) * Math.PI * Math.pow(valor, 3);
        System.out.printf("Volume: %.2f\n",volumeEsfera);
    }

}
