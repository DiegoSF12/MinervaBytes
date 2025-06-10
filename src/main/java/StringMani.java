public class StringMani {
    public static void main(String[] args) {
        String teste = "Lorem ipsum dolor sit amet, \nconsectetur adipiscing elit. Donec nec justo pulvinar, ornare augue sed, \nporttitor ante. Nullam lacinia mi ipsum, sit amet hendrerit eros suscipit eget.   ";
        String ts01;
        String ts02;
        String ts03;
        String ts04;

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

    }
}
