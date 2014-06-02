/**
 * project_name:test
 * package_name:PACKAGE_NAME
 * user: Administrator
 * date: 14-4-2
 */
public class Demo1 {
    public static void main(String[] args) {
        //基本数据类型 To String
        int num = 100;
        //String s = (String)num;
        String s = String.valueOf(num);
        System.out.println(s);


        //String to 基本数据类型
        String s2 = "1000";
        //int n = (String)s2;   //wrong
        int n = new Integer(s2);
        int n2 = Integer.parseInt(s2);//常用


    }
}
