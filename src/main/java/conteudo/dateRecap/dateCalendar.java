//Como realizar operações com data/hora usando a classe Calendar

package conteudo.dateRecap;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class dateCalendar {
    public static void main(String[] args) throws ParseException{
        //Criando a mascara de formatação para Date
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        Date d01 = Date.from(Instant.parse("2025-07-23T13:32:00-03:00"));
        Date d02 = Date.from(Instant.now());
        sdf1.setTimeZone(TimeZone.getTimeZone("America/Sao_Paulo"));
        
        System.out.println("d01 = "+sdf1.format(d01));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d01);
        cal.add(Calendar.HOUR_OF_DAY, 3);
        d01 = cal.getTime();

        //Como resgatar somente um pedaço da informação de data ou hora com o Calendar
        int minutes = cal.get(Calendar.MINUTE);
        int days = cal.get(Calendar.DAY_OF_YEAR);
        int month = 1 + cal.get(Calendar.MONTH);

        System.out.println("d01 att = "+sdf1.format(d01));
        System.out.println("d02 = "+sdf1.format(d02));
        System.out.println("Minutos = "+ minutes);
        System.out.println("Dia do ano = "+days);
        System.out.println("Mês = "+month);
    }
}
