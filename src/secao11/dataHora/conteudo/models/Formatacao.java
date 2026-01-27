package secao11.dataHora.conteudo.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

public class Formatacao{
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2025-02-12");
        LocalDateTime d02 = LocalDateTime.parse("2025-02-12T18:00:00");
        Instant d03 = Instant.now();

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

        System.out.println("LocalDate usando formatter: " + fmt1.format(d01));
        System.out.println("LocalDateTime usando formatter: " + d02.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
        System.out.println("Instant usando formatter: " + fmt3.format(d03));
        System.out.println("LocalDateTime ISO: " + d02.format(fmt4));
    }
}