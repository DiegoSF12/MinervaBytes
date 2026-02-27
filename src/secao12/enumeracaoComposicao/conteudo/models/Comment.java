package secao12.enumeracaoComposicao.conteudo.models;

public class Comment {
    private String text;

    public Comment(String text){
        this.text = text;
    }

    public void setText(String text){
        this.text = text;
    }

    public String getText(){
        return this.text;
    }
}
