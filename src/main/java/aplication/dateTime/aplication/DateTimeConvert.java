package aplication.dateTime.aplication;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeConvert {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2025-07-01");
        LocalDateTime d02 = LocalDateTime.parse("2025-07-01T01:30:26");
        Instant d04 = Instant.parse("2025-07-01T01:30:26Z");
        Instant d03 = Instant.now();

        LocalDate r1 = LocalDate.ofInstant(d04,ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d04,ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d03,ZoneId.of("Portugal"));
        LocalDateTime r4 = LocalDateTime.ofInstant(d03,ZoneId.systemDefault());
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.of("Europe/London"));


        System.out.println("No Brasil (System) = " + r1.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Em Portugal = " + r2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("\n_________ Usando dados reais ___________________");
        System.out.println("Brasil: "+ r4.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
        System.out.println("Portugal: " + r3.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
        System.out.println("Referencia: Europe/London GMT = " + fmt1.format(d03));

        System.out.println("Dia: " + d02.getDayOfMonth());
        System.out.println("Mês: " + d02.getMonth());
        System.out.println("Ano: " + d02.getYear());
        System.out.print("Hora: " + d02.getHour() + "  Minutos: " + d02.getMinute());
    }
}
