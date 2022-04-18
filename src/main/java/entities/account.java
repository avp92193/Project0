package entities;

import java.util.Scanner;

public class account {
    private double deposit;
    private double withdraw;
    private double ViewBalance;
    private String username;

    public account() {

    }

    public account(double deposit, double withdraw, double viewBalance) {
        this.deposit = deposit;
        this.withdraw = withdraw;
        ViewBalance = viewBalance;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }

    public double getViewBalance() {
        return ViewBalance;
    }

    public void setViewBalance(double viewbalance) {
        this.ViewBalance = viewbalance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "account{" +
                "deposit=" + deposit +
                ", withdraw=" + withdraw +
                ", ViewBalance=" + ViewBalance +
                ", username='" + username + '\'' +
                '}';
    }
    public class user {
        public String username;
        public String password;
        public String account_type;
    }

}

