package me.youzipi.concurrent;

/**
 * Created by youzipi on 16/10/18.
 */
public class BankTest {
    public static final int NACCOUNTS = 100;
    public static final double INITAL_BALANCE = 1000;

    public static void main(String[] args) {
        Bank bank = new Bank(NACCOUNTS, INITAL_BALANCE);
        for (int i = 0; i < NACCOUNTS; i++) {
            BankRunnable r = new BankRunnable(bank, i, INITAL_BALANCE);
            Thread t = new Thread(r, "银行" + i);
            t.start();
        }
    }
}
