package secao12.enumeracaoComposicao.atividades.test;

import secao12.enumeracaoComposicao.atividades.enums.OrderStatus;
import secao12.enumeracaoComposicao.atividades.models.Client;
import secao12.enumeracaoComposicao.atividades.models.Order;
import secao12.enumeracaoComposicao.atividades.models.OrderItem;
import secao12.enumeracaoComposicao.atividades.models.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

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
        Client client01 = new Client(nameClient, email, date);
        sc.nextLine();
        

        System.out.println("Enter order data");
        System.out.print("Status: ");
        String status = sc.nextLine();
        Order order01 = new Order(OrderStatus.valueOf(status));
        sc.nextLine();


        System.out.print("How many items to this order ? ");
        int count = sc.nextInt();
        for(int i = 0; i < count; i++){
            System.out.print("Product Name: ");
            String nameProduct = sc.nextLine();
            sc.nextLine();
            System.out.print("Product Price: ");
            double price = sc.nextInt();
            System.out.println("Quantity: ");
            int quantity = sc.nextInt();
            order01.addItem(new OrderItem(quantity, price, new Product(nameProduct, price)));
        }
        

    }
}
