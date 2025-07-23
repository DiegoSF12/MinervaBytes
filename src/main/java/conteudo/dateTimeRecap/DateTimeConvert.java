/*
Principais tipos Java (Versão 8+)
 ° Data-hora local
    ° LocalDate
    ° LocalDateTime
 ° Data-hora global
    ° Instant
 ° Duração
    ° Duration
 ° Outros
    ° ZoneId
    ° ChronoUnit
 */
package conteudo.dateTimeRecap;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTimeConvert {
    public static void main(String[] args) {
        //Criando uma mascara de formatação para o Instant
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy").withZone(ZoneId.of("Zulu"));
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.of("Zulu"));
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //Instanciando novos objetos do tipo time
        LocalDate d01 = LocalDate.parse("20/07/2025",fmt3);
        System.out.println("d01 fmt3 = "+d01);
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");
        Instant d04 = Instant.now();

        //Criando os objetos que receberão a data formatada
        LocalDate r1 = LocalDate.ofInstant(d04,ZoneId.of("America/Sao_Paulo"));
        LocalDateTime r2 = LocalDateTime.ofInstant(d04, ZoneId.of ("America/Sao_Paulo"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d04,ZoneId.of("Portugal"));

        //Convertendo de Zulu time para America/Sao_Paulo
        System.out.println("Instant Now (Zulu): "+fmt2.format(d04));
        System.out.println("LocalDate (America/Sao_Paulo): "+fmt1.format(r1));
        System.out.println("LocalDateTime (America/Sao_Paulo): "+fmt2.format(r2));

        //Convertendeo de Zulu para Portugal
        System.out.println("\nLocalDateTime (Portugal): "+fmt2.format(r3));

        //Como recuperar somente uma informação do DateTime
        System.out.println("\nDia: "+r2.getDayOfMonth());
        System.out.println("Mês: "+r2.getMonth());
        System.out.println("Ano: "+r2.getYear());
        System.out.println("Hora: "+r2.getHour());
        System.out.println("Minutos: "+r2.getMinute());

    }
}
