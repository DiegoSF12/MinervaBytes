package secao13.herancaPolimorfismo.conteudo.models;

public class BusinessAccount extends Account {
    private Double loanLimit;

    public BusinessAccount(Integer number, String holder, Double balance) {
        super(number, holder, balance);
    }

    private void loan(Double amount){

    }
}
