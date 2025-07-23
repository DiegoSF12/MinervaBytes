package conteudo.dateTimeRecap;

import java.sql.SQLOutput;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeCalc {
    public static void main(String[] args) {
        //Criando mascaras de formatação para time
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        //Instanciando os novos objetos
        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        //Realizando as operações com data podemos utilizan minus, plus e etc
        LocalDate pastWeekLocalDate = d01.minusDays(7);
        LocalDate nextWeekLocalDate = d01.plusDays(7);
        LocalDate nextYearsLocalDate = d01.plusYears(3);
        LocalDate pastYearsLocalDate = d01.minusYears(3);
        System.out.println("PastWeekLocalDate: " + pastWeekLocalDate.format(fmt1));
        System.out.println("NextWeekLocalDate: " + nextWeekLocalDate.format(fmt1));
        System.out.println("NextYearsLocalDate: " + nextYearsLocalDate.format(fmt1));
        System.out.println("PastYearsLocalDate: " + pastYearsLocalDate.format(fmt1));
        System.out.println("------------------------------------------------------");

        //Realizando operações com data e hora
        LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);
        LocalDateTime pastHoursLocalDateTime = d02.minusHours(9);
        LocalDateTime nextHoursLocalDateTime = d02.plusHours(72);
        System.out.println("PastWeekLocalDateTime: " + pastWeekLocalDateTime.format(fmt2));
        System.out.println("NextWeekLocalDateTime: " + nextWeekLocalDateTime.format(fmt2));
        System.out.println("PastHourssLocalDateTime: " + pastHoursLocalDateTime.format(fmt2));
        System.out.println("NextHoursLocalDateTime: " + nextHoursLocalDateTime.format(fmt2));
        System.out.println("------------------------------------------------------");

        //Realizando operações de Data Hora com Instant
        //Este não possui suporte ao ChronoUnit.YEARS
        Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);
        System.out.println("PastWeekInstant: "+fmt3.format(pastWeekInstant));
        System.out.println("NextWeekInstant: "+fmt3.format(nextWeekInstant));
        System.out.println("------------------------------------------------------");

        //Verificando a duração entre dois intervalos de tempo distindtos usando a classe Duration
        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay());//Para se trabalhar com LocalDate, devemos fazer a conversão para LocalDateTime ou Instant, tem de ter suporte a segundos, e para isso usamos o timeObject.atStartOfDay()
        Duration t2 = Duration.between(pastWeekLocalDateTime, d02);
        Duration t3 = Duration.between(pastWeekInstant, d03);
        Duration t4 = Duration.between(d03, pastWeekInstant);
        System.out.println("T1 = "+ t1.toDays());
        System.out.println("T2 = "+ t2.toDays());
        System.out.println("T3 = " + t3.toDays());
        System.out.println("T3 = "+ t4.toDays());

    }
}
