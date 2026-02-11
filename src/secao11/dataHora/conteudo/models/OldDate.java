package secao11.dataHora.conteudo.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.time.Instant;

public class OldDate {
    public static void main(String[] args) throws ParseException{
        //Definindo a formatação de cada Date
        SimpleDateFormat sdf01 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf02 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf03 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        //Informando a qual TimeZone esse SimpleDateFormat pertence
        sdf03.setTimeZone(TimeZone.getTimeZone("GMT"));

        //Instanciando um objeto Date com data e hora local
        Date dt01 = new Date();//Instanciando um objeto no momento atual
        Date dt02 = new  Date(System.currentTimeMillis());//Instanciando um objeto no momento atual com milissegundos
        Date dt03 = sdf02.parse("15/01/2004 18:30:00");//Para passar uma String para o Date devemos usa o metodo parse() da clase SimpleDateFormat

        System.out.println(dt01);
        System.out.println(dt02);
        System.out.println("---------------");
        System.out.println(sdf01.format(dt01));
        System.out.println(sdf02.format(dt02));
        System.out.println(sdf03.format(dt02));
        System.out.println("---------------");
        System.out.println(sdf02.format(dt03));
        

    }
}
