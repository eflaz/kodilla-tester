package com.kodilla.bank.homework;

public class BankApp {
    public static void main(String[] args) {
        Bank bank = new Bank();
        System.out.println(bank.sumBalance());
        System.out.println(bank.sumDeposit());
        System.out.println(bank.sumWithdraw());
        System.out.println(bank.sumDepositAverage());
        System.out.println(bank.sumWithdrawAverage());

    }
}
