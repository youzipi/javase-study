/**
 * project_name:test
 * package_name:PACKAGE_NAME
 * user: Administrator
 * date: 14-4-10
 */
public class Account {


    private String name;
    private String id;
    private String password;

    public Account() {
        this.init();
    }

    private void init(){
        this.name = "Noname";
        this.id = "";
        this.password = "111111";
        this.balance = 0.0;

        for (int i = 0;i < 6;i++) {
            int temp = (int) (Math.random() * 100) % 10;//0~9
            id = id + temp;
        }
        this.showInfo();
    }

    @Override
    public String toString() {
        return "Name:" + this.getName() + "\nAccount:" + this.getId() + "\nLeft:" + this.getBalance();
        //return super.toString();
    }

    public void showInfo(){

    }
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private double balance;
}
