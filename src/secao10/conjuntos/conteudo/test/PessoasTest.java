package secao10.conjuntos.conteudo.test;

import java.util.Scanner;
import secao10.conjuntos.conteudo.models.Pessoas;
import java.util.List;
import java.util.ArrayList;

public class PessoasTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Pessoas> listaPessoas = new ArrayList<Pessoas>();
        System.out.print("Quantas pessoas deseja adicionar a lista ?");
        int quantidade = sc.nextInt();
        for(int i = 0; i < quantidade; i++){
            sc.nextLine();
            System.out.printf("Digite o nome %dº pessoa: ", (i + 1));
            String nome = sc.nextLine();
            System.out.println("Digite a idade: ");
            Integer idade = sc.nextInt();
            sc.nextLine();
            System.out.println("Deseja informa o e-mail ? ");
            String opcao = sc.nextLine().toUpperCase();
            String email;
            if(opcao.equals("SIM")){
                System.out.println("Informe o endereço de e-mail: ");
                email = sc.nextLine();
                listaPessoas.add(new Pessoas(nome, idade, email));
            }else {
                listaPessoas.add(new Pessoas(nome, idade));
            }
        }    
        for(Pessoas x:listaPessoas){
            System.out.println(x.toString());
        }
        System.out.print("Digite o nome para remover: ");
        String remove = sc.nextLine();
        listaPessoas.removeIf(x -> x.getNome().equals(remove));

        for(Pessoas x:listaPessoas){
            System.out.println(x.toString());
        }
    }
}
