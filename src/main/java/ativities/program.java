package aplication;

import java.util.Scanner;
import java.util.Locale;

public class program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double xA, xB,xC;
        double yA, yB, yC;
        double p, areaX, areaY;

        System.out.println("Enter the measures of triangle X:");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y:");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        p = (xA + xB + xC) / 2;
        areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2;
        areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("Triangle X area: %.4f\n",areaX);
        System.out.printf("Triangle y area: %.4f\n",areaY);

        if(areaX > areaY){
            System.out.println("Large area: X");
        } else{
            System.out.println("Large area: Y");
        }
    }
}
