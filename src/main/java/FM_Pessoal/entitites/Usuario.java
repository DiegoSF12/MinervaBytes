package FM_Pessoal.entitites;

import java.util.List;
import java.util.ArrayList;

public class Usuario {
    private String nome;
    private List<Album> albunsFavoritos;

    public Usuario(String nome){
        this.nome = nome;
        albunsFavoritos = new ArrayList<>();
    }

    public String getNome(){
        return this.nome;
    }

    public void adicionarAlbum(Album album){
        albunsFavoritos.add(album);
    }

    public void removerAlbum(Album album){
        albunsFavoritos.remove(album);
    }

    public void listarAlbuns(){
        if(albunsFavoritos.isEmpty()){
            System.out.println("***Infelizmente a sua lista de albuns se encontra vazia***");
        }
        else{
            for(Album x : albunsFavoritos){
                System.out.println(x.toString());
            }
        }
    }
}
