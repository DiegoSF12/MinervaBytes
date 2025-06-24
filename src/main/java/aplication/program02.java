package aplication;

import java.util.Scanner;
import java.util.Locale;

public class program02 {
    public static void main(String[] args) {
        TriangleEntitie X = new TriangleEntitie();
        TriangleEntitie Y = new TriangleEntitie();
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double p, areaX, areaY;

        System.out.println("Enter the measures of triangle X:");
        X.a = sc.nextDouble();
        X.b = sc.nextDouble();
        X.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y:");
        Y.a = sc.nextDouble();
        Y.b = sc.nextDouble();
        Y.c = sc.nextDouble();

        areaX = X.area();
        areaY = Y.area();

        System.out.printf("Triangle X area: %.4f\n",areaX);
        System.out.printf("Triangle y area: %.4f\n",areaY);

        if(areaX > areaY){
            System.out.println("Large area: X");
        } else{
            System.out.println("Large area: Y");
        }
    }
}
