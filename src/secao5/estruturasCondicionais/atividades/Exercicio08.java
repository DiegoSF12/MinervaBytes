/*
    Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
 */

package secao5.estruturasCondicionais.atividades;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario;
        double imposto;

        System.out.println("Por favor, informe a sua renda mensal: ");
        salario = sc.nextDouble();
        System.out.println("Iniciando o calculo do seu imposto. Pressione ENTER para continuar...");
        sc.nextLine();

        if(salario <= 2000.00){
            imposto = 0.00;
        }
        else if(salario <= 3000.00){
            imposto = (salario - 2000.00) * 0.08;
        }
        else if(salario <= 4500.00){
            imposto = (salario - 3000.00) * 0.18 + 1000.00 * 0.08;
        }
        else{
            imposto = (salario - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.0 * 0.08;
        }
        if(imposto == 0.00){
            System.out.println("Isento de impostos");
        }
        else{
            System.out.printf("Imposto R$ %.2f\n", imposto);
        }
        sc.close();
    }
}
