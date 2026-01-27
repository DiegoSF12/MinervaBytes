package secao11.dataHora.conteudo.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

public class Instanciacao {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.now();
        System.out.println("LocalDate: " + d01);

        LocalDateTime d02 = LocalDateTime.now();
        System.out.println("LocalDateTime: " + d02);

        Instant d03 = Instant.now();
        System.out.println("Instant: " + d03);

        LocalDate d04 = LocalDate.parse("2020-01-15");
        System.out.println("LocalDate Parse: " + d04);

        LocalDateTime d05 = LocalDateTime.parse("2020-01-15T17:30");
        System.out.println("Meu melhor aniverssãrio (LocalDateTime Parse): " + d05.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"))); //Usei um formatter

        Instant d06 = Instant.parse("2020-01-15T17:30:00Z");
        System.out.println("Instant Parse: " + d06);

        Instant d07 = Instant.parse("2026-02-04T07:00:00-03:00");
        System.out.println("Quando volto a trabalhar(Instant Parse GMT-3: " + d07);

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d08 = LocalDate.parse("15/01/2004", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("22/05/2020 19:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println("Data de nascimento (LocalDate usando DateTimeFormatter): " + d08);
        System.out.println("O primeiro encontro (LocalDateTime usando DateTimeFormatter: " + d09);

        //Existe um metodo do LocalDate e LocalDateTime que permite que você instancie uma nova data usando valores separados, sem a necessidade de uma string unica
        LocalDate d10 = LocalDate.of(2023,11,8);
        LocalDateTime d11 = LocalDateTime.of(2023,11,8,13,00);
        System.out.println("Quando comecei no UNICERP (LocalDate.of(): " + d10);
        System.out.println("Quando comecei no UNICERP (LocalDateTime.of(): " + d11);
        


    }
}
