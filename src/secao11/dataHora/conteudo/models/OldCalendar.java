package secao11.dataHora.conteudo.models;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.text.ParseException;

public class OldCalendar {
    public static void main(String[] args) throws ParseException{
        SimpleDateFormat sdf01 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date dt01 = Date.from(Instant.parse("2023-11-08T22:00:00Z"));

        System.out.println("Momento que saio do serviço no GMT: " + sdf01.format(dt01));

        Calendar cal = Calendar.getInstance();
        cal.setTime(dt01);
        cal.add(Calendar.HOUR_OF_DAY, 3);
        dt01 = cal.getTime();
        int minutos = cal.get(Calendar.MINUTE);
        int horas = cal.get(Calendar.HOUR);
        int primeiroDia = cal.get(Calendar.DAY_OF_WEEK);


        System.out.println("Hora em saio do serviço em BRT (GMT-3): " + sdf01.format(dt01));
        System.out.println("Minutos: " + minutos);
        System.out.println("Horas: " + horas);
    }

}
