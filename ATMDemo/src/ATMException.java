/**
 * project_name:test
 * package_name:PACKAGE_NAME
 * user: Administrator
 * date: 14-4-10
 */
public class ATMException extends Exception{
    String msg;
    ATMException(String msg){
        this.msg = msg;
    }

    @Override
    public String toString() {
        return this.msg;
    }
}
