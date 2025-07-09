package FM_Pessoal.entitites;

public class Album {
    private String nome;
    private String artista;
    private int anoLancamento;
    private Generos genero;

    public Album(){

    }
    public Album(String nome, String artista, int anoLancamento,Generos genero){
        this.nome = nome;
        this.artista = artista;
        this.anoLancamento = anoLancamento;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public Generos getGenero() {
        return genero;
    }

    public void setGenero(Generos genero) {
        this.genero = genero;
    }

    public String toString(){
        return String.format("Nome do album: %s\nNome do artista: %s\nAno de lançamento: %d\nGenero: %s\n",this.getNome(),this.getArtista(),this.getAnoLancamento(),this.getGenero());
    }
}








