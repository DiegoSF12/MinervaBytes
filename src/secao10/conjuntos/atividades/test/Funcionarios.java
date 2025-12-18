package secao10.conjuntos.atividades.test;

import secao10.conjuntos.atividades.models.Funcionario;
import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;

public class Funcionarios {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Funcionario> listaFuncionarios = new ArrayList<>();
        int quantidade, count;

        System.out.print("Quantos funcionarios você deseja cadastrar? ");
        quantidade = sc.nextInt();
        System.out.println();
        for(count = 0; count < quantidade; count++){
            System.out.printf("Funcionario #%d\n",(count + 1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            double salario = sc.nextDouble();
            if(listaFuncionarios.equals(listaFuncionarios.stream().filter(x -> x.getID() == id))){
                System.out.println("O ID informado ja pertece a outro funcionario, por favor, informe outro");
            }else{
                listaFuncionarios.add(new Funcionario(nome,id,salario));
            }
        }
        for(Funcionario x : listaFuncionarios){
            System.out.println(x);
        }
        sc.close();
    }
}
