package secao12.enumeracaoComposicao.conteudo.models;

import secao12.enumeracaoComposicao.conteudo.enums.WorkerLevel;
import java.util.ArrayList;
import java.util.Calendar;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Departament departament;
    private ArrayList<HourContract> contracts = new ArrayList<>();

    public Worker(){

    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public ArrayList<HourContract> getContracts() {
        return contracts;
    }

    /*
    public void setContracts(ArrayList<HourContract> contracts) {
        this.contracts = contracts;
    }

     */

    public void addContract(HourContract contract){
         contracts.add(contract);
    }
    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public Double incomeYear(int year, int month){
        Calendar cal = Calendar.getInstance();
        double sum = baseSalary;
         for(HourContract x : contracts){
              cal.setTime(x.getDate());
              int x_month = 1 + cal.get(Calendar.MONTH);
              int x_year = cal.get(Calendar.YEAR);
              if(year == x_year && month == x_month){
                  sum += x.totalValue();
              }
         }
         return sum;
    }



}
