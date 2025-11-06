/*
    Uma operadora de telefonia cobra R$ 50.00 por um plano básico que
dá direito a 100 minutos de telefone. Cada minuto que exceder a
franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a
quantidade de minutos que uma pessoa consumiu, daí mostrar o valor
a ser pago.
 */

package secao5.estruturasCondicionais.conteudo;

import java.util.Scanner;
import java.util.Locale;

public class ProblemExemplo01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minutos, sobresalente;
        double valorPagar;

        System.out.println("Digite o valor de minutos utilizados durante esse mês");
        minutos = sc.nextInt();
        if(minutos > 100){
            sobresalente = minutos - 100;
            valorPagar = (sobresalente * 2) + 50.00;
        }
        else{
            valorPagar = 50.00;
        }
        System.out.printf("Valor a pagar R$ %.2f", valorPagar);
        sc.close();
    }
}
