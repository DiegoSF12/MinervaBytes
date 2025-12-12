/*
    A dona de um pensionato possui dez quartos para alugar para estudantes, sendo esses quartos identificados pelos numeros 0 a 9.
    Fazer um programa que inicie com todos os dez quartos vazios, e depois leia a quantidade N representando o número de estudantes que vão alugar os quartos(N pode ser de 1 a 10). Em seguida, registre o aluguel dos N estudantes. Para cada registro de aluguel, informar o nome e e-mail do estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Ao final, seu programa deve imprimir um relatorio de todas as ocupções do pensionato, por ordem de quarto.
*/
package secao10.conjuntos.atividades.models;

public class Hospede {
    private String nome;
    private String email;
    private int numQuarto;
    
    public Hospede(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setNumQuarto(int numQuarto) {
        this.numQuarto = numQuarto;
    }

    public int getNumQuarto() {
        return this.numQuarto;
    }

    public void imprime() {
        
    }
}
