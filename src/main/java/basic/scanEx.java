package basic;

import java.util.Locale;
import java.util.Scanner;

public class scanEx {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        char x;

        x = sc.next().charAt(0);
        System.out.println("Vocẽ digitou: "+x);

        sc.close();
    }
}
