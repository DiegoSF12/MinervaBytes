/*
    Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
*/
package secao6.estruturasRepetitivas.atividades;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha = "2002";
        String senhaDigitada;

        System.out.print("POr favor, informa a sua senha de usuário: ");
        senhaDigitada = sc.next();
        while(!(senha.equals(senhaDigitada))){
            System.out.print("Senha inválida! Digite novamente: ");
            senhaDigitada = sc.next();
        }
        System.out.println("Acesso Permitido!");
        sc.close();
    }
}
