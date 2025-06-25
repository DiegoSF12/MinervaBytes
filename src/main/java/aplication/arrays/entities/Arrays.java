package aplication.arrays.entities;

import java.util.Scanner;
import java.util.Locale;

public class Arrays{
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Defina o tamanho do vetor (array unidimensional) ");
        int tamanho = sc.nextInt();
        double[] alturas = new double[tamanho];
        double media = 0;
        
        for(int i = 0; i < alturas.length; i++){
            System.out.printf("Digite a %d° altura ",i+1);
            alturas[i] = sc.nextDouble();
            media += alturas[i];
        }
        media = media / alturas.length;
        System.out.printf("A media de alturas é igual a: %.2f",media);

        sc.close();
    }
}