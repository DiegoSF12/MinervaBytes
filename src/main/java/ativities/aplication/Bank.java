package ativities.aplication;

import ativities.entities.BankAccount;

import java.util.Scanner;
import java.util.Locale;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        BankAccount user01;
        
        System.out.print("Enter account number: ");
        double account = sc.nextDouble();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String accountHolder = sc.nextLine();
        System.out.print("Is the initial deposit value (y/N)? ");
        char option = sc.nextLine().charAt(0);


        if(option == 'y'){
            System.out.print("Enter inital deposit value: ");
            double balance = sc.nextDouble();
            user01 = new BankAccount(account, accountHolder,balance);
        }
        else{
            user01 = new BankAccount(account, accountHolder);
        }
        System.out.println(user01);
        System.out.print("Enter a  deposit value: ");
        user01.deposit(sc.nextDouble());
        System.out.println(user01);
        System.out.print("Enter a withraw value: ");
        user01.withraw(sc.nextDouble());

        System.out.println("Update account data:\n"+user01);
        
        sc.close();
    }
    
}
