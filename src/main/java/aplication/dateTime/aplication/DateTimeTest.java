package aplication.dateTime.aplication;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeTest {
    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime d01 = LocalDateTime.now();
        LocalDate d02 = LocalDate.now();
        Instant d03 = Instant.now();
        LocalDate d04 = LocalDate.parse("2025-07-01");
        LocalDateTime d05 = LocalDateTime.parse("2025-07-01T10:43:50");
        Instant d06 = Instant.parse("2025-07-01T10:43:50Z");
        LocalDate d07 = LocalDate.parse("01/07/2025", fmt1);
        LocalDateTime d08 = LocalDateTime.parse("15/01/2004 14:01", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        //Essa é uma outra opção, ao inves de se criar uma variavel para armazenar o padrão, podemos o definir no momento da criação


        System.out.println("D02 = " + d02);
        System.out.println("D01 = " + d01);
        System.out.println("D03 = " + d03);
        System.out.println("D04 = " + d04);
        System.out.println("D05 = " + d05);
        System.out.println("D06 = " + d06);
        System.out.println("D07 = " + d07);
        System.out.println("D08 = " + d08);
    }
}
