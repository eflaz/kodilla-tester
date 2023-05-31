package com.kodilla.bank.homework;

public class CashMachine {
    private int[] values;
    private int size;

    public CashMachine() {
        this.size = 0;
        this.values = new int[0];
    }

    public void add(int value) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(values, 0, newTab, 0, values.length);
        newTab[this.size - 1] = value;
        this.values = newTab;
    }

    public int[] getValues() {
        return values;
    }

    public int getBalance() {
        int sum = 0;
        for (int i = 0; i < this.values.length; i++) {
            sum += this.values[i];
        }
        return sum;
    }

    public int getDeposit() {
        int count = 0;
        for (int i = 0; i < this.values.length; i++) {
            if (this.values[i] < 0) {
                count++;
            }

        }

        return count;
    }

    public int getWithdraw() {
        int count = 0;
        for (int i = 0; i < this.values.length; i++) {
            if (this.values[i] > 0) {
                count++;
            }

        }

        return count;

    }

    public int getDepositAverage() {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < this.values.length; i++) {
            if (this.values[i] < 0) {
                sum += this.values[i];
                count++;
            }
        }
        return sum / count;
    }

    public int getWithdrawAverage() {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < this.values.length; i++) {
            if (this.values[i] > 0) {
                sum += this.values[i];
                count++;
            }
        }
        return sum / count;
    }

}





