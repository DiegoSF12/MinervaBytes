package secao9.construtores.atividades.models;

import java.util.Scanner;

public class ContaBancaria {
    private int numConta;
    private String nome;
    private double valorDeposito;
    private double saldo = 0;

    public ContaBancaria(int numConta, String nome, double valorDeposito){
        this.nome = nome;
        this.numConta = numConta;
        this.valorDeposito = valorDeposito;
        this.saldo = valorDeposito;
    }

    public ContaBancaria(int numConta, String nome){
        this.nome = nome;
        this.numConta = numConta;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public int getNumConta(){
        return numConta;
    }
    public String toString(){
        return String.format("\n\nInformações da conta\nNome do titular: %s\nNumero da conta: %d\nSaldo Diponivel:%.2f",this.getNome(), this.getNumConta(), saldo);
    }
    public void deposito(Scanner sc){
        System.out.print("Por favor, informe o valor a ser depositado: ");
        double deposito = sc.nextDouble();
        saldo += deposito;
    }
    public void saque(Scanner sc){
        System.out.print("Informe o valor que deseja realizar o saque: ");
        double saque = sc.nextDouble();
        if(saldo >= saque + 5){
            saldo = saldo - saque - 5;
        }
        else{
            System.out.print("Você não possui saldo suficiente.");
        }

    }
}
