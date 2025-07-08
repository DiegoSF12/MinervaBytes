package ativities.worker.aplication;

import ativities.worker.entities.Departament;
import ativities.worker.entities.HourContract;
import ativities.worker.entities.Worker;
import ativities.worker.entities.enums.WorkerLevel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter departament's name: ");
        String departamentName = sc.nextLine();
        System.out.println("Enter Worker data");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker01 = new Worker(workerName, WorkerLevel.valueOf(workerLevel),baseSalary, new Departament(departamentName));
        Worker worker02 = new Worker();
/*
        worker02.setName(sc.nextLine());
        worker02.setDepartament(new Departament(sc.nextLine()));
        sc.nextLine();
        worker02.setBaseSalary(sc.nextDouble());
        worker02.setLevel(WorkerLevel.valueOf(sc.nextLine()));
*/


        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.printf("Enter contract #%d data\n",i);
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration(hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate,valuePerHour,hours);
            worker01.addContract(contract);
        }
        System.out.println();
        System.out.print("Enter month and year to calculate income(MM/YYYY): ");
        String MaY = sc.next();
        int month = Integer.parseInt(MaY.substring(0,2));
        int year = Integer.parseInt(MaY.substring(3));
        System.out.printf("Name: %s\n", worker01.getName());
        System.out.printf("Departament: %s\n", worker01.getDepartament().getName());
        System.out.printf("Income for %s: %.2f",worker01.getName(), worker01.income(year,month));

        sc.close();
    }
}
