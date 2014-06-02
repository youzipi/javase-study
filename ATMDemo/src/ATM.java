import java.util.Scanner;

/**
 * project_name:test
 * package_name:PACKAGE_NAME
 * user: Administrator
 * date: 14-4-10
 */
public class ATM {
    private static final Scanner in = new Scanner(System.in);
    private static int choice;
    private static Account account;

    public static void showMenu(){
        System.out.println("***************");
        System.out.println("\t1.开户");
        System.out.println("\t2.查询余额");
        System.out.println("\t3.存款");
        System.out.println("\t4.取款");
        System.out.println("\t5.修改密码");
        System.out.println("\t6.退出..");
        System.out.println("\t请选择：");
        choice = in.nextInt();
    }

    public static void initAccount(){
        account = new Account();
        //account.init();
        System.out.println("开户成功，账户信息如下");
        System.out.println(account);
    }

    public static void showBalance(){
        System.out.println(account);
    }

    public static boolean deposite(int number){
        try{
            if(number <= 0) {
                throw new ATMException("存款金额非法！");
            }
            else {
                account.setBalance(account.getBalance() + number);
                System.out.println("存款成功");
                return true;
            }
        }
        catch(ATMException ex){
                System.out.println(ex);
                return false;
            }
    }


    public static boolean draw(int number){
        try{
            if(number <= 0) {
                throw new ATMException("取款金额非法！");
            }
            else if(number >= account.getBalance()){
                throw new ATMException("余额不足。。");

            }
            else {
                account.setBalance(account.getBalance() - number);
                System.out.println("取款成功");
                return true;
            }
        }
        catch(ATMException ex){
            System.out.println(ex);
            return false;
        }
    }

    public static void main(String[] args) {

        ATM.showMenu();
        while(choice != 6){
            switch (choice){
                case 1:
                    ATM.initAccount();
                    break;
                case 2:
                    ATM.showBalance();
                    break;
                case 3:
                    System.out.println("Input the number:");
                    int number = in.nextInt();
                    ATM.deposite(number);
                    break;
                case 4:
                    System.out.println("Balance:" + account.getBalance());
                    System.out.println("Input the number:");
                    number = in.nextInt();
                    ATM.draw(number);
                    break;

            }
            ATM.showMenu();
        }
        System.out.println("已退出系统...");
    }
}

