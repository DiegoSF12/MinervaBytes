/*
    A dona de um pensionato possui dez quartos para alugar para estudantes, sendo esses quartos identificados pelos numeros 0 a 9.
    Fazer um programa que inicie com todos os dez quartos vazios, e depois leia a quantidade N representando o número de estudantes que vão alugar os quartos(N pode ser de 1 a 10). Em seguida, registre o aluguel dos N estudantes. Para cada registro de aluguel, informar o nome e e-mail do estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Ao final, seu programa deve imprimir um relatorio de todas as ocupções do pensionato, por ordem de quarto.
*/
package secao10.conjuntos.atividades.test;

import java.util.Scanner;
import secao10.conjuntos.atividades.models.Hospede;

public class Pensionato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hospede[] hospedes = new Hospede[10];
        int quantidadeHospedes, numeroQuarto;
        String nome, email;

        System.out.print("Informe a quantidade de hospedes: ");
        quantidadeHospedes = sc.nextInt();
        if (quantidadeHospedes > 10) {
            boolean loop = true;
            while (loop) {

                System.out.print("O numero de hospedes não pode ser maior que 10. informe um valor válido: ");
                quantidadeHospedes = sc.nextInt();
                if (quantidadeHospedes <= 10) {
                    loop = false;
                }
            }
        }
        for (int i = 0; i < quantidadeHospedes; i++) {
            sc.nextLine();
            System.out.printf("Informe o nome do %d° hospede: ", (i + 1));
            nome = sc.nextLine();
            System.out.print("O endereço de e-mail: ");
            email = sc.nextLine();
            System.out.print("Agora informe o numero do quarto desejado: ");
            numeroQuarto = sc.nextInt();
            if (hospedes[numeroQuarto - 1] != null) {
                boolean loop = true;
                while (loop) {
                    System.out.println("Quarto ocupado, escolha um dos disponiveis na lista abaixo");
                    for (int j = 0; j < hospedes.length; j++) {
                        if (hospedes[j] == null)
                            System.out.print((j + 1) + " | ");
                    }
                    numeroQuarto = sc.nextInt();
                    if (hospedes[numeroQuarto - 1] == null) {
                        loop = false;
                    }
                }
            }
            hospedes[numeroQuarto - 1] = new Hospede(nome, email);
            hospedes[numeroQuarto - 1].setNumQuarto(numeroQuarto - 1);
        }
        System.out.println("Quartos alugados");
        for (int k = 0; k < hospedes.length; k++) {
            if (hospedes[k] != null) {
                System.out.printf("Nome: %s\n", hospedes[k].getNome());
                System.out.printf("E-mail: %s\n", hospedes[k].getEmail());
                System.out.printf("Numero do quarto: %d\n", hospedes[k].getNumQuarto());
            }
        }
        sc.close();
    }
}
