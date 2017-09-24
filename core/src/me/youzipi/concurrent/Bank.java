package me.youzipi.concurrent;


/**
 * Created by junhong on 2015/10/20.
 */
public class Bank {
    private final double[] accounts;

    public Bank(int n, double initBank) {
        accounts = new double[n];
        for (int i = 0; i < n; i++)
            accounts[i] = initBank;
    }

    public void transfer(int from, int to, double amount) {
//        lock.lock();
        if (accounts[from] < amount) {
            // System.out.println("余额不足，无法转账");
            return;
        }
//        System.out.print("当前运行：" + Thread.currentThread().getName());
        accounts[from] -= amount;
        System.out.printf(" %10.2f 从 %d 到 %d", amount, from, to);
        accounts[to] += amount;
        System.out.printf("   共有金额 %10.2f\n", getTotalMoney());

    }

    public double getTotalMoney() {
        double sum = 0;
        for (double a : accounts)
            sum += a;
        return sum;
    }

    public int size() {
        return accounts.length;
    }
}