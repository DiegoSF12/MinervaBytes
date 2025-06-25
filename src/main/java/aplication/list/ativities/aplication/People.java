package aplication.list.ativities.aplication;

import aplication.list.ativities.entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class People {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Person p01 = new Person();
        int size;

        System.out.println("Quantas pessoas serão digitadas? ");
        size = sc.nextInt();
        sc.nextLine();
        Person[] people = new Person[size];

        for(int i = 0; i < people.length; i++){
            System.out.printf("Digite os dados da %d° pessoa:\n",i+1);
            System.out.print("Nome: ");
            people[i] = new Person();
            people[i].setNome(sc.nextLine());
            System.out.print("Idade: ");
            people[i].setIdade(sc.nextInt());
            System.out.print("Altura: ");
            people[i].setAltura(sc.nextDouble());
            sc.nextLine();
        }
        System.out.println(Person.averageHeight(people));

    }
}
