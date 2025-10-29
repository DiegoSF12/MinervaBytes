package secao4.estruturaSequencial.conteudo;

import java.util.Locale;

public class FuncoesMatematicas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        System.out.printf("Raiz quadrada de %f = %f\n",x,A);
        System.out.printf("Raiz quadrada de %f = %f\n",y,B);
        System.out.printf("Raiz quadrada de 25.0 = %f\n",C);

        A = Math.pow(x,y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        System.out.printf("%f elevado a %f = %f\n",x, y, A);
        System.out.printf("%f elevado ao quadrado = %f\n",x, B);
        System.out.printf("5 elevado ao quadrado = %f\n",C);

        A = Math.abs(y);
        B = Math.abs(z);
        System.out.printf("O valor absoluto de %f = %f\n",y, A);
        System.out.printf("O valor absoluto de %f = %f\n",z, B);

    }
}
