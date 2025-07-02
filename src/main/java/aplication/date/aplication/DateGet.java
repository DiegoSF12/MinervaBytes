package aplication.date.aplication;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjuster;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateGet {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("Europe/London"));

        Date d = Date.from(Instant.now());
        //Date d = Date.from(Instant.now().atZone(ZoneId.of("London")).toInstant());

        System.out.println(sdf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        int minutes = cal.get(Calendar.MINUTE);
        int month = 1 + cal.get(Calendar.MONTH);

        System.out.printf("Minutes: %d\n",minutes);
        System.out.printf("Month: %d\n", month);
    }
}
