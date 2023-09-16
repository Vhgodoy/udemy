package src.entities;

public class Account {

    private Integer number;
    private String holder;
    private  Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit (Double amount) {balance += amount;}

    public void withdraw (Double amount) {
        if (amount > withdrawLimit ){
            System.out.println("Withdraw error: The amount execeeds withdraw limit");
        }
        else if (amount > balance) {
            System.out.println("withdraw error: not enough balance");
        }
        else    System.out.printf("New balance: %.2f" , balance -= amount );
        }

}
