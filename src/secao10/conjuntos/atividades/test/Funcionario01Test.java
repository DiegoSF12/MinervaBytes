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
        for(int i = 0; i < N; i++){
            
            System.out.println();
            System.out.printf("Employee #%d: \n", (i + 1));
            System.out.printf("ID: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            funcionaios.add(new Funcionario01(name, id, salary));
        }
        System.out.print("Enter the employee id that will have a salary increase: ");
        Integer idFind = sc.nextInt();
        for(Funcionario01 x : funcionaios){
            
        }
        sc.close();
    }
    public static Integer hasId(List<Funcionario01> funcionarios, int id){
        
    }
}
