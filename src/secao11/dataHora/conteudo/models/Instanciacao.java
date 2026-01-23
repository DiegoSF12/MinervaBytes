package secao11.dataHora.conteudo.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Instant;

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
        System.out.println("Meu melhor aniverssãrio (LocalDateTime Parse): " + d05);

        Instant d06 = Instant.parse("2020-01-15T17:30-03:00");
        System.out.println("Instant Parse: " + d06);


    }
}
