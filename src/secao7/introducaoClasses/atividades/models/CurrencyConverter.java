/*
    Exercício de fixação

    Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por uma pessoa em reais.
    Informar quantos reais a pessoa vai pagar pelos dólares,
    considerando ainda que a pessoa terá que pagar 6% de IOF sobre o valor em dólar.
    Criar uma classe CurrencyConverter para ser responsável pelos cálculos.
*/

package secao7.introducaoClasses.atividades.models;

import java.util.Scanner;

public class CurrencyConverter {
    private double valorCompra;
    private double valorDollar;
    private double valorReais;
    private static final int IOF = 6;

    public double getValorReais() {
        return valorReais;
    }

    public void setValorReais(double valorReais) {
        this.valorReais = valorReais;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getValorDollar() {
        return valorDollar;
    }

    public void setValorDollar(double valorDollar) {
        this.valorDollar = valorDollar;
    }
    public void converter(Scanner sc){
        System.out.print("Por favor, informe o valor da cotação atual do Dollar: ");
        this.setValorDollar(sc.nextDouble());
        System.out.println("Quantos Dollares você deseja comprar? ");
        this.setValorCompra(sc.nextDouble());
        double auxiliar = this.getValorCompra() * this.getValorDollar();
        this.setValorReais((auxiliar * IOF / 100) + auxiliar );
        System.out.println("Você irá pagar ja com os impostos:");
        System.out.printf("R$ %.2f",getValorReais());
        sc.close();

    }
}
