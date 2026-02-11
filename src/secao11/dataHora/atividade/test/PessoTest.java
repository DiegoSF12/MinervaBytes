package secao11.dataHora.atividade.test;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import secao11.dataHora.atividade.models.Pessoa;
import java.util.Scanner;

public class PessoTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Pessoa pessoa01 = new Pessoa("Diego Souza",22, "Diegofranciscodesouza7@gmail.com");
        System.out.printf("Por favor, informe a sua data de nascimento. Dia: ");
        int dia = sc.nextInt();
        System.out.print("Agora infome o mês(numero): ");
        int mes = sc.nextInt();
        System.out.println("E por fim, o ano: ");
        int ano = sc.nextInt();
        LocalDate nascimento = LocalDate.of(ano,mes,dia);

        Period t1 = Period.between(nascimento,LocalDate.now());
        if(t1.getYears() <= 18){
            System.out.println("Infelizmente você não tem idade suficiente para prosseguir.");
        }
        pessoas.add(pessoa01);
        pessoas.get(0).setIdade(t1.getYears());
        System.out.println(pessoas.get(0));
    }
}
