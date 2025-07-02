package aplication;

import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ProductTest02 {
    /*Funciona da mesma forma que a classe ProductTest
    porém com a instanciação do objeto logo após a
    inicialização das variaveis
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        Product prd = new Product(name,price,quantity);

        System.out.println("Product data: "+prd);
        System.out.print("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        prd.addProducts(quantity);
        System.out.println("Update data: "+prd);
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        prd.removeProducts(quantity);
        System.out.println("Update data: "+prd);

        JOptionPane.showMessageDialog(null,prd);

        sc.close();
    }
}
