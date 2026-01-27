package secao11.dataHora.atividade.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pessoa {
    private String nome;
    private Integer idade;
    private String email;
    private LocalDateTime registro;

    public Pessoa(){
        registro = LocalDateTime.now();
    }
    public Pessoa(String nome, Integer idade, String email){
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        registro = LocalDateTime.now();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegistro() {
        return registro.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
    }

    public void setRegistro(LocalDateTime registro) {
        this.registro = registro;
    }
    @Override
    public String toString(){
        return String.format("Nome: %s\nIdade: %d\nE-mail: %s\nHora de registro: %s",this.getNome(), this.getIdade(), this.getEmail(), this.getRegistro());
    }
}
