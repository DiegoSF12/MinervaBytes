package secao9.construtores.atividades.models;

import java.util.Scanner;

public class MenuBancario {
    public static void menu(Scanner sc){
        String op;
        double deposito;
        System.out.print("Seja bem vindo ao Banco Central, para iniciarmos, por favor, informe o numero de sua conta: ");
        int numConta = sc.nextInt();
        System.out.print("Agora informe o seu nome: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.print("Deseja realizar um deposito inicial ? (S/n)");
        op = sc.nextLine().toUpperCase();
        if(op.equals("S")){
            System.out.println("Qual o valor do primeiro deposito? ");
            deposito = sc.nextDouble();
            ContaBancaria cc = new ContaBancaria(numConta,nome,deposito);
            System.out.println(cc);
            cc.deposito(sc);
            System.out.println(cc);
            cc.saque(sc);
            System.out.println(cc);

        }
        else{
            ContaBancaria cc = new ContaBancaria(numConta,nome);
            System.out.println(cc);
            cc.deposito(sc);
            System.out.println(cc);
            cc.saque(sc);
            System.out.println(cc);
        }


    }
}
