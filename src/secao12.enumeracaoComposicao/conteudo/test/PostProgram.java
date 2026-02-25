package secao12.enumeracaoComposicao.conteudo.test;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
import java.util.Locale;
import java.text.SimpleDateFormat;
import secao12.enumeracaoComposicao.conteudo.models.Post;
import secao12.enumeracaoComposicao.conteudo.models.Comment;

public class PostProgram {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow thats's awesome!");

        Post p1 = new Post(sdf1.parse("21/06/2018 13:05:44"),"Traveling to New Zealand","I'm going to visit this wonderful country", 12);
        p1.addComments(c1);
        p1.addComments(c2);

        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the Force be with you");
        Post p2 = new Post(sdf1.parse("29/07/2018 23:14:19"),"Good night guys","See you tomorrow", 5);
        p2.addComments(c3);
        p2.addComments(c4);

        System.out.println(p1);
        System.out.println(p2);



    }
}
