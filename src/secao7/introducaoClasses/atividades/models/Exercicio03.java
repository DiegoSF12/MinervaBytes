/*
    Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
    (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
    ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
    para o aluno obter o mínimo para ser aprovado (que é 60% da nota).
 */
package secao7.introducaoClasses.atividades.models;

import java.util.Scanner;

public class Exercicio03 {
    private String nome;
    private double[] notas = new double[3];

    public Exercicio03(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    public void incluirNotas(Scanner sc){
        System.out.printf("Olá %s. Bem vindo ao sistema da escola ...\n", this.getNome());
        for(int i = 0; i < notas.length; i++) {
            System.out.printf("Informe o valor da nota do %dº Trimestre: ", (i + 1));
            notas[i] = sc.nextDouble();
            if(i == 0 && notas[i] > 30){
                while(boolean loop = true){
                System.out.println("Valor invalido, a nota não pode ser maior que 30, digite novamente: ");
                notas[i] = sc.nextDouble();
                if(i == 0 && notas[i] <= 30){
                    loop = false;
                }
            }
        }
    }
    public boolean situacao(){
        for(int i = 0; i < notas.length; i++){

        }
        return true;
    }
    public void mostrarNotas(){

    }

}
