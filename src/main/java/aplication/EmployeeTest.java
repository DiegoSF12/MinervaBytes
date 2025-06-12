package aplication;

import java.util.Scanner;
import java.util.Locale;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee func = new Employee();
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Name: ");
        func.setName(sc.nextLine());
        System.out.print("Groos Salary: ");
        func.setGroosSalary(sc.nextDouble());
        System.out.print("Tax: ");
        func.setTax(sc.nextDouble());
        System.out.println("Employee: "+func);
        System.out.print("Wich percentage to increase salary? ");
        func.increaseSalary(sc.nextDouble());
        System.out.println("Update data: "+func);

        sc.close();
    }
}
