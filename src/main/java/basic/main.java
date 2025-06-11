package basic;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int higher;
        int a,b,c;

        System.out.println("Por favor, digite 3 numeros inteiros para a verificação");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        higher = mainTeste.max(a,b,c);
        mainTeste.showResult(higher);
    }
}
