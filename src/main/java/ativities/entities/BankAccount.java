package ativities.entities;

public class BankAccount {
    private double numCont;
    private String usuario;
    private double balance;

    public BankAccount(double numCont, String usuario) {
        this.numCont = numCont;
        this.usuario = usuario;
        balance = 0;
    }

    public BankAccount(double numCont, String usuario, double initialDeposit) {
        this.numCont = numCont;
        this.usuario = usuario;
        deposit(initialDeposit);
    }

    private void setNumCont(double numCont) {
        this.numCont = numCont;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public double getNumCont() {
        return this.numCont;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double value) {
        balance += value;
    }

    public void withraw(double value) {
        balance -= value + 5;
    }

    public String toString() {
        return String.format("\nAccount Data\nAccount: %.0f\nHolder: %s\nBalance: %.0f", this.getNumCont(), this.getUsuario(), this.getBalance());
    }
}
