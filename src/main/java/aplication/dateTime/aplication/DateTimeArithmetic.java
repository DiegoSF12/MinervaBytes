package aplication.dateTime.aplication;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTimeArithmetic {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2025-07-01");
        LocalDateTime d02 = LocalDateTime.parse("2025-07-01T15:00:00");
        Instant d03 = Instant.now();//parse("2025-07-01T15:00:00Z");

        LocalDate pastWeekLocalDate = d01.minusWeeks(1);
        LocalDate nextWeelLocalDate = d01.plusWeeks(1);
        LocalDateTime nextHour = d02.plusHours(2);
        //PARA O INSTANT DEVEMOS INSTANCIAR UM OBJETO ChronoUnit.<TIPO>
        Instant nextDay = d03.plus(1, ChronoUnit.DAYS);
        Instant lastDay = d03.minus(1, ChronoUnit.DAYS);


        System.out.println(d01);
        System.out.println(pastWeekLocalDate);
        System.out.println(nextWeelLocalDate);
        System.out.println(nextHour);
        System.out.println(nextDay);
        System.out.println(lastDay);




    }
}
