package secao12.enumeracaoComposicao.atividades.test;

import java.util.Scanner;
import java.util.Locale;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class OrderProgram {
    public static void main (String[] args)throws ParseException {
        Locale locale = Locale.US;
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data");
        System.out.print("Name: ");
        String nameClient = sc.nextLine();
        System.out.print("E-mail: ");
        String email = sc.nextLine();
        System.out.print("Birth Date (DD/MM/YYYY): ");
        Date date = sdf1.parse(sc.next());

        System.out.println("Enter order data");
        System.out.print("Status: ");
        String status = sc.nextLine();
        sc.nextLine();
        System.out.print("How many items to this order ? ");
        int count = sc.nextInt();
        for(int i = 0; i < count; i++){
            System.out.print("Product Name: ");
            String nameProduct = sc.nextLine();
            System.out.print("Product Price: ");
            
        }


    }
}
