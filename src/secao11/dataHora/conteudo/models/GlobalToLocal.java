package secao11.dataHora.conteudo.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


public class GlobalToLocal {
    public static void main(String[] args) {
        //Criamos um format para padronizar as saídas
        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        //Instanciamos várias datas e um instant passando das 00 horas, para haver mudança quando ocorrer a conversão
        LocalDate d01 = LocalDate.parse("2020-01-26");
        LocalDateTime d02 = LocalDateTime.parse("2020-01-26T22:30:26");
        Instant d03 = Instant.parse("2020-01-26T01:30:26Z");

        //Aqui realizamos a conversão, é necessário que informemos a data Global e também timezone que será atribuído ao novo objeto
        LocalDate cv01 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        LocalDateTime cv02 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());

        System.out.println("Instant para LocalDate: " + cv01.format(fmt01));
        System.out.println("Instant para LocalDateTime: " + cv02.format(fmt02));

        //Como recuperar somente um dos campos presentes no LocalDate/LocalDateTime
        System.out.println("Dia: " + d01.getDayOfMonth());
        System.out.println("Mês: " + d01.getMonth().toString().toLowerCase());
        System.out.println("Ano: " + d01.getYear());
        System.out.println("Horas: " + d02.getHour());
        System.out.println("Minutos: " + d02.getMinute());
    }
}