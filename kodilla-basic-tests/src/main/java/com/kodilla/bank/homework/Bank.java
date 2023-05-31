package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;

   public Bank() {
       CashMachine cashMachine1 = new CashMachine();
       cashMachine1.add(10);
       CashMachine cashMachine2 = new CashMachine();
       cashMachine2.add(20);
       CashMachine cashMachine3 = new CashMachine();
       cashMachine3.add(30);
       cashMachines = new CashMachine[]{cashMachine1, cashMachine2, cashMachine3};
   }

   public int sumBalance() {
       int sum = 0;
       for (int i = 0; i < this.cashMachines.length; i++) {
           sum += this.cashMachines[i].getBalance();
       }
       return sum;
   }

   public int sumDeposit() {
       int sum = 0;
       for (int i = 0; i < this.cashMachines.length; i++) {
           sum += this.cashMachines[i].getDeposit();
       }
       return sum;
   }

    public int sumWithdraw() {
        int sum = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            sum += this.cashMachines[i].getWithdraw();
        }
        return sum;
    }

    public double sumDepositAverage() {
        double sum = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            sum += this.cashMachines[i].getDepositAverage();
        }
        return sum/this.cashMachines.length;
    }

    public double sumWithdrawAverage() {
        double sum = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            sum += this.cashMachines[i].getWithdrawAverage();
        }
        return sum/this.cashMachines.length;
    }

}

