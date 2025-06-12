package aplication;

import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ProductTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Product prd = new Product();

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        prd.setName(sc.nextLine());
        System.out.print("Price: ");
        prd.setPrice(sc.nextDouble());
        System.out.print("Quantity in stock: ");
        prd.setQuantity(sc.nextInt());

        System.out.println("Product data: "+prd);
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
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
