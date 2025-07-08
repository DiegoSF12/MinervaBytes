package FM_Pessoal.entitites;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private List<Album> albunsFavoritos;

    public Usuario(){

    }

    public Usuario(String nome){
        this.nome = nome;
        this.albunsFavoritos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addAlbum(Album album){
        albunsFavoritos.add(album);
    }

    public void removeAlbum(Album album){
        albunsFavoritos.remove(album);
    }

    public void listarAlbuns(){
        if(albunsFavoritos.isEmpty()){
            System.out.println("Não existe uma lista de favoritos");
        }
        else{
            System.out.printf("Albuns favoritos de %s",this.getNome());
            for(Album a : albunsFavoritos){
                System.out.print(" " + a);
            }
        }
    }
}
