package aplication.dateTime.aplication;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateTimeArithmetic {
    public static void main(String[] args) {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        LocalDate d01 = LocalDate.parse("2025-07-02");
        LocalDateTime d02 = LocalDateTime.parse("2025-07-02T15:00:00");
        LocalDate brt = LocalDate.parse(sc.nextLine(),fmt1);
        Instant d03 = Instant.now();//parse("2025-07-01T15:00:00Z");
        

        LocalDate pastWeekLocalDate = d01.minusWeeks(1);
        LocalDate nextWeelLocalDate = d01.plusWeeks(1);
        LocalDateTime nextHour = d02.plusHours(2);
        //PARA O INSTANT DEVEMOS INSTANCIAR UM OBJETO ChronoUnit.<TIPO>
        Instant nextDay = d03.plus(1, ChronoUnit.DAYS);
        Instant lastDay = d03.minus(1, ChronoUnit.DAYS);
        Duration life = Duration.between(brt.atStartOfDay(ZoneId.systemDefault()),d01.atStartOfDay(ZoneId.systemDefault()));
    

        System.out.println(d01);
        System.out.println(pastWeekLocalDate);
        System.out.println(nextWeelLocalDate);
        System.out.println(nextHour);
        System.out.println(nextDay);
        System.out.println(lastDay);
        System.out.println("Meu tempo de vida em dias é: " + life.toDays());
        




    }
}
