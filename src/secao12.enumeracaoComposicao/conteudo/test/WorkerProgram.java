package secao12.enumeracaoComposicao.conteudo.test;

import secao12.enumeracaoComposicao.conteudo.enums.WorkerLevel;
import secao12.enumeracaoComposicao.conteudo.models.HourContract;
import secao12.enumeracaoComposicao.conteudo.models.Worker;
import secao12.enumeracaoComposicao.conteudo.models.Departament;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Scanner;

public class WorkerProgram {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String dpName = sc.nextLine();
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.println("Level: ");
        String wkLevel = sc.nextLine();
        System.out.print("Base salary: ");
        Double wkSalary = sc.nextDouble();
        Worker worker = new Worker(name, WorkerLevel.valueOf(wkLevel), wkSalary, new Departament(dpName));

        System.out.println("How many contracts to this worker?");
        System.out.print("R: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.printf("Enter contract #%d data:\n", (i+ 1));
            System.out.print("Date (DD/MM/AAAA): ");
            Date contactDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();
            System.out.print("Duration: ");
            int duration = sc.nextInt();
            HourContract contract = new HourContract(contactDate,valuePerHour,duration);
            worker.addContract(contract);
        }
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("=============================================\n");
        System.out.printf("Name: %s\n", worker.getName());
        System.out.printf("Department: %s\n", worker.getDepartament().getName());
        System.out.printf("Income for %s:  %.2f\n",monthAndYear,worker.incomeYear(year, month));
        System.out.println("\n=============================================");

        sc.close();
    }
}
