package secao12.enumeracaoComposicao.conteudo.models;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Post {
    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    private ArrayList<Comment> comments = new ArrayList<>();
    private static SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public Post(Date moment, String title, String content, Integer likes){
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public void addComments(Comment comment){
        comments.add(comment);
    }

    public void removeComments(Comment comment){
        comments.remove(comment);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("-----------------------------------------\n");
        sb.append(String.format("%s\n",this.getTitle()));
        sb.append(String.format("%d Likes - %s\n",this.getLikes(),sdf1.format(this.getMoment())));
        sb.append(String.format("%s\n", this.getContent()));
        sb.append("Comments: \n");
        for(Comment c : comments){
            sb.append(String.format("%s\n",c.getText()));
        }
        sb.append("-----------------------------------------\n");
        return sb.toString();
    }
}
