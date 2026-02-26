package secao12.enumeracaoComposicao.atividades.models;

import java.util.Date;

public class Client {
    private String name;
    private String email;
    private Date birthDate;

    public Client(String name, String email, Date birthDate){
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setBirthDate(Date birthDate){
        this.birthDate = birthDate;
    }
    
    public Date getBirthDate(){
        return birthDate;z
    }
}
