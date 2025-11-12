/*
    Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
    (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
    ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
    para o aluno obter o mínimo para ser aprovado (que é 60% da nota).
 */
package secao7.introducaoClasses.atividades.models;

import java.util.Scanner;

public class Exercicio03Aluno{
    private String nome;
    private double nota01, nota02, nota03;
    private double nota;

    public Exercicio03Aluno(String nome){
        this.nome = nome;
    }
    public Exercicio03Aluno(){

    }
    public void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Para inciar, informe o seu nome: ");
        this.nome = sc.nextLine();
        System.out.printf("Seja bem vindo %s\n",this.nome);
        System.out.println("Agora informe a sua primeira nota");
        nota01 = sc.nextDouble();
        while(nota01 > 30){
            System.out.print("A nota do primeiro trimestre não deve ser maior que 30, insira um valor valido: ");
            nota01 = sc.nextDouble();
        }
        System.out.println("Agora informe a nota do segundo trimestre: ");
        nota02 = sc.nextDouble();
        while(nota02 > 35){
            System.out.print("A nota do segundo trimestre deve ser menor que 35, insira um valor valido: ");
            nota02 = sc.nextDouble();
        }
        System.out.print("Agora a nota do terceiro e ultimo trimestre: ");
        nota03 = sc.nextDouble();
        while(nota03 > 35){
            System.out.print("A nota deve ser menor que 35, informe um valor valido: ");
            nota03 = sc.nextDouble();
        }
        nota = nota01 + nota02 + nota03;
        if(nota >= 60){
            System.out.printf("Parabéns, você foi aprovado e sua nota final foi %.2f", nota);
        }
        else{
            System.out.printf("Infelizmente você não foi aprovado, sua nota final foi %.2f", Math.abs(nota - 60));
        }
        sc.close();
    }
}