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
import java.time.format.DateTimeFormatter;

public class dateTime {
    public static void main(String[] args) {
        //Classe utilizada prioritariamente para instaciar objetos
        //Criando um novo padrão de mascara para formatação de datas e horas com o formatter
        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        /*Instanciando os objetos com o horario atual*/
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        /*Instanciando os objetos com horarios apartir de Strings no padrão ISO 8601*/
        LocalDate d04 = LocalDate.parse("2025-07-23");
        LocalDateTime d05 = LocalDateTime.parse("2025-01-13T13:01");
        Instant d06 = Instant.parse("2004-01-15T07:35:00Z");
        Instant d07 = Instant.parse("2004-01-15T07:35:00-03:00");//Esse é o horario definido para o sistem America/São_paulo porém o sistema o guarda em GMT

        /*Instanciando objetos DateTime com a mascara de formatação*/
        LocalDate d08 = LocalDate.parse("21/07/2025",fmt01);
        LocalDateTime d09 = LocalDateTime.parse("09/11/2023 22:00", fmt02);
        LocalDateTime d10 = LocalDateTime.parse("07/01/1997 02:00",DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));//Essa é uma forma alternativa, de modo direto e sem criar objetos do tipo formatter

        /*Instanciando objetos DateTime com argumentos separados, usamos o metodo "of"*/
        LocalDate d11 = LocalDate.of(2023,8,22);//Esse é um metodo com sobrecarga, podem ser usados varios tipos de argumentos
        LocalDateTime d12 = LocalDateTime.of(2020,1,15,18,15);

        System.out.println("Imprimindo na tela horario corrente do sistema");
        System.out.println("LocalDate: "+d01);
        System.out.println("LocalDateTime: "+d02);
        System.out.println("Instant: "+d03);

        System.out.println("\nImprimindo na tela horarios personalizados");
        System.out.println("LocalDate: "+d04);
        System.out.println("LocalDateTime: "+d05);
        System.out.println("Instant: "+d06);
        System.out.println("Instant(GMT-3): "+d07);//Ele salva como Zulu time

        System.out.println("\nImprimindo na tela datas e horas com formato personalizado (mascaras)");
        System.out.println("LocalDate: "+d08.format(fmt01));
        System.out.println("LocalDateTime: "+d09.format(fmt02));

        System.out.println("\nImprimindo na tela datas obtidas atraves de informações 'quebradas'");
        System.out.println("LocalDate: "+d11.format(fmt01));
        System.out.println("LocalDateTime: "+d12.format(fmt02));


    }
}
