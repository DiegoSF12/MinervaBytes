package conteudo.dateRecap;

import java.util.Date;
import java.util.TimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;

public class date {
    public static void main(String[] args) throws ParseException {
        //Criando uma mascara para data
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));     

        Date d01 = sdf1.parse("23/07/2025");
        Date d02 = sdf2.parse("23/07/2025 10:15:00");
        Date d03 = new Date();//Instanciando o objeto com a data e hora atual
        Date d04 = new Date(System.currentTimeMillis());//Outra forma de instaciar o objeto com a data e hora do sistema
        Date d05 = Date.from(Instant.parse("2025-07-23T10:40:00-03:00"));//Usando o fuso horario GMT-3
        Date d06 = Date.from(Instant.now());

        //Imprimindo as datas sem formatação
        System.out.println("Imprimindo datas sem a formatação");
        System.out.println("d01 = "+d01);
        System.out.println("d02 = "+d02);
        System.out.println("d03 = "+d03);
        System.out.println("d04 = "+d04);
        System.out.println("d05 = "+d05);
        
        System.out.println("----------------------------");

        //Imprimindo as datas com formatação
        System.out.println("Datas com formatação do SimpleDateFormat");
        System.out.println("d01 = "+sdf1.format(d01));
        System.out.println("d02 = "+sdf2.format(d02));
        System.out.println("d03 = "+sdf2.format(d03));
        System.out.println("d04 = "+sdf2.format(d04));
        System.out.println("d05 = "+sdf3.format(d05));
        System.out.println("d06 = "+sdf3.format(d06));
        System.out.println("----------------------------");

        //Imprimindo as data/hora no fuso horario GMT
        System.out.println("Usando o fuso horario GMT");
        System.out.println("d01 = "+sdf3.format(d01));
        System.out.println("d02 = "+sdf3.format(d02));
        System.out.println("d03 = "+sdf3.format(d03));
        System.out.println("d04 = "+sdf3.format(d04));
        System.out.println("d05 = "+sdf3.format(d05));
        System.out.println("d06 = "+sdf3.format(d06));
        System.out.println("----------------------------");
            
    }
    
}
