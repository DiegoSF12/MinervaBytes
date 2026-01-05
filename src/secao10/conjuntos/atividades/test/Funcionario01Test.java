package secao10.conjuntos.atividades.test;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import secao10.conjuntos.atividades.models.Funcionario01;

public class Funcionario01Test {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Funcionario01> funcionaios = new ArrayList<>();

        System.out.print("How many empolyees will be registered? ");
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {

            System.out.println();
            System.out.printf("Employee #%d: \n", (i + 1));
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            while(hasId(funcionaios, id)){
                System.out.print("ID is already taken! Try again: ");
                id = sc.nextInt();
            }
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            funcionaios.add(new Funcionario01(name, id, salary));
        }
        System.out.print("\nEnter the employee id that will have a salary increase: ");
        int idFind = sc.nextInt();
        Integer pos = position(funcionaios, idFind);
        if (pos == null) {
            System.out.println("This id does not exist");
        } else {
            System.out.print("Enter te percentage: ");
            double percent = sc.nextDouble();
            funcionaios.get(pos).increaseSalary(percent);
        }
        System.out.println();
        System.out.print("List of employee");
        for (Funcionario01 x : funcionaios) {
            System.out.println(x.toString());
        }
        sc.close();
    }

    public static Integer position(List<Funcionario01> funcionarios, int id) {
        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
    public static boolean hasId(List<Funcionario01> list, int id){
        Funcionario01 func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return func != null;
    }
}