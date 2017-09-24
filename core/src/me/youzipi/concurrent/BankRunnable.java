package me.youzipi.concurrent;

/**
 * Created by youzipi on 16/10/18.
 */

public class BankRunnable implements Runnable {

    private Bank bank;
    private int from;
    private int to;
    private double maxAmount;
    private int DELAY = 10;

    public BankRunnable(Bank bank, int from, double max) {
        this.bank = bank;
        this.from = from;
        this.maxAmount = max;
    }

    public void run() {
        try {
            while (true) {
                int toAccount = (int) (bank.size() * Math.random());
                double amount = maxAmount * Math.random();
                bank.transfer(from, toAccount, amount);
                Thread.sleep((int) (DELAY * Math.random()));
            }
        } catch (InterruptedException e) {
        }
    }
}