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

public class DateTimeFormat {
    public static void main(String[] args) {
        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());//Mascara de formatação usada para tipos globais, o timezone foi especificado
        DateTimeFormatter fmt04 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt05 = DateTimeFormatter.ISO_DATE;
        DateTimeFormatter fmt06 = DateTimeFormatter.ISO_INSTANT; //Essas são formas de usar constantes para asumir valores pre definidos


        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        System.out.println("Imprimindo LocalDate formatado(mascara)");
        System.out.println("LocalDate(passando fmt01 como paramentro): "+d01.format(fmt01));
        System.out.println("LocalDate(usando o fmt01 como objeto: "+fmt01.format(d01));
        System.out.println("LocalDate(chamando o metodo sem criar uma variavel): "+d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("\nImprimindo o LocalDateTime formatado (mascara)");
        System.out.println("LocalDateTime(passando fmt02 como parametro): "+d02.format(fmt02));
        System.out.println("LocalDateTime (usando o fmt02 como chamador do metodo: "+fmt02.format(d02));
        System.out.println("LocalDateTime(chamando o metodo sem criar uma variavel): "+d02.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));

        System.out.println("\nImprimindo o Instant formatado (mascara)");
        System.out.println("Instant (usando o fmt03 como chamador): "+fmt03.format(d03));//Nesse caso, a data e hora motrados serão relativos ao fusohorario especificado no momento da criação da mascara





    }
}
