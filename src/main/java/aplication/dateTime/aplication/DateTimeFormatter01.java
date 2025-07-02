package aplication.dateTime.aplication;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter01 {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2025-07-01");
        LocalDateTime d02 = LocalDateTime.parse("2025-07-01T11:29:30");
        Instant d03 = Instant.now();
        LocalTime t01 = LocalTime.now();

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm").withZone(ZoneId.of("Europe/London"));
        DateTimeFormatter fmt3 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_INSTANT;
        //São constantes que podem ser usadas para definir o tipo de formatação que o Texto terá;


        System.out.println("D01 ISO 8610 = " + d01);
        System.out.println("D01 dd/MM/yyyy = " + d01.format(fmt1));
        System.out.println("D02 dd/MM/yyyy HH:mm = " + d02.format(DateTimeFormatter.ofPattern("dd/MM/yy HH:mm")));
        System.out.println("T01 Horario local = "+ t01.format(DateTimeFormatter.ofPattern("HH:mm")));
        System.out.println("D03 ISO 8610 = " + d03);
        System.out.println("D03 Formatado = " + fmt2.format(d03));
    }
}

