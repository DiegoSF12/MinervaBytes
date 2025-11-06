/*
    Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
*/
package secao5.estruturasCondicionais.atividades;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaIncio, horaFim;
        int duracao;

        System.out.print("Informe a hora de inicio: ");
        horaIncio = sc.nextInt();
        System.out.print("Informe a hora do fim: ");
        horaFim = sc.nextInt();

        if(horaIncio < horaFim){
            duracao = horaIncio - horaFim;
        }
        else{
            duracao = 24 - (horaIncio - horaFim);
        }
        System.out.printf("O jogo durou %d Horas",Math.abs(duracao));
        sc.close();
    }
}
