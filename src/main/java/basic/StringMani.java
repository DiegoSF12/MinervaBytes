package basic;

public class StringMani {
    public static void main(String[] args) {
        String teste = "Lorem ipsum dolor sit amet, \nconsectetur adipiscing elit. Donec nec justo pulvinar, ornare augue sed, \nporttitor ante. Nullam lacinia mi ipsum, sit amet hendrerit eros suscipit eget.   ";
        String ts01;
        String ts02;
        String ts03;
        String ts04;
        String ts05;
        String ts06;
        int i;
        int j;


        System.out.println("String em sua forma original:");
        System.out.println(teste);
        System.out.println("------------------------------------------------------------------------------");

        System.out.println("String com todos caracteres minusculos LowerCase():");
        ts01 = teste.toLowerCase();
        System.out.println(ts01);
        System.out.println("------------------------------------------------------------------------------");

        System.out.println("String com todos os caracteres maisculos UpperCase():");
        ts02 = teste.toUpperCase();
        System.out.println(ts02);
        System.out.println("------------------------------------------------------------------------------");

        System.out.println("String sem espaços desnecessários no inicio ou fim trim():");
        ts03 = teste.trim();
        System.out.println(ts03);
        System.out.println("------------------------------------------------------------------------------");

        System.out.println("Criando uma substring a partir de original substring():");
        ts04 = teste.substring(30);
        System.out.println(ts04);
        System.out.println("------------------------------------------------------------------------------");

        System.out.println("Susbstituindo um unico caractere com o metodo replace():");
        ts05 = teste.replace('a','x');
        System.out.println(ts05);
        System.out.println("------------------------------------------------------------------------------");

        System.out.println("Substituindo varios caracteres de uma vez com o replace():");
        ts06 = teste.toLowerCase();
        ts06 = ts06.replace("lo","Rmd");
        System.out.println(ts06);
        System.out.println("------------------------------------------------------------------------------");

        System.out.println("Encontrando o inicio de uma determinada cadeia de caracteres com indexOf()");
        i = teste.indexOf("dolor");
        System.out.printf("A posição é: %d\n",i);
        System.out.println("------------------------------------------------------------------------------");

        System.out.println("Encontrando a ultima ocorrencia de uma determinada cadeia de caracteres com lastIndexOf():");
        j = teste.lastIndexOf("ve");
        System.out.printf("A posição é: %d\n",j);
        System.out.println("------------------------------------------------------------------------------");

    }
}
