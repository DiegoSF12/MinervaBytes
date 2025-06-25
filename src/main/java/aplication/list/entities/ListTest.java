package aplication.list.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListTest {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2,"Marcos");

        System.out.printf("Size of list: %d\n",list.size());
        for(String x : list){
            System.out.println(x);
        }
        System.out.println("-------------");
        list.removeIf(x -> x.charAt(0) == 'M');
        System.out.println("List without names that start with 'M'");
        for(String x : list){
            System.out.println(x);
        }
        System.out.println("-------------");
        System.out.printf("Index of Bob: %d\n",list.indexOf("Bob"));
        System.out.printf("index of Marco: %d\n",list.indexOf("Marco"));
        System.out.println("-------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        System.out.println("List with names that start with 'A'");
        for(String x : result){
            System.out.println(x);
        }
        System.out.println("-------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);



    }
}
