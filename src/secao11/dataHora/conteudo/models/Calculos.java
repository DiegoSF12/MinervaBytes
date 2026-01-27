package secao11.dataHora.conteudo.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.Duration;

public class Calculos {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        LocalDateTime oFim = LocalDateTime.parse("2019-08-19T00:00:00");
        LocalDateTime nascimento = LocalDateTime.parse("2004-01-15T14:30:00");

        LocalDate pastWeek = d01.minusWeeks(1);
        LocalDateTime pastWeek01 = d02.minusWeeks(1);
        Instant pastWeek02 = d03.minus(7, ChronoUnit.DAYS);//Devemos usar um objeto ChronoUnity para especificar a medida temporal
        System.out.println("LocalDate -1 Semana: " + pastWeek);
        System.out.println("LocalDateTime -1 Semana: " + pastWeek01);
        System.out.println("Instant -1 Semana: " + pastWeek02);

        System.out.println("-----------------------------------------");

        LocalDate nextWeek = d01.plusWeeks(1);
        LocalDateTime nextWeek01 = d02.plusWeeks(1);
        Instant nextWeek02 = d03.plus(7, ChronoUnit.DAYS);//Devemos usar um objeto ChronoUnity para especificar a medida temporal
        System.out.println("LocalDate +1 Semana: " + nextWeek);
        System.out.println("LocalDateTime +1 Semana: " + nextWeek01);
        System.out.println("Instant +1 Semana: " + nextWeek02);

        System.out.println("-----------------------------------------");

        Duration t1 = Duration.between(oFim,d02);
        Duration t2 = Duration.between(LocalDateTime.parse("2004-01-15T14:30:00"),LocalDateTime.now());
        Duration t3 = Duration.between(LocalDate.parse("2004-01-15").atTime(0,0),d01.atStartOfDay());
        System.out.println("A quantos dias eu vivo desse jeito ? " + t1.toDays());
        System.out.println("A quantos dias eu existo ? " + t2.toDays());
        System.out.println("Duração entre dois intervalos usando LocalDate: " + t3.toDays());

    }
}
