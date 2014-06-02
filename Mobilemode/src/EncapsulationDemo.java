/**
 * project_name:test
 * package_name:PACKAGE_NAME
 * user: Administrator
 * date: 14-4-2
 */
public class EncapsulationDemo {
    public static void main(String[] args) {
        int n1 = 100;
        Integer n2 = new Integer("100");
        Float f = new Float("3.145");
        Boolean flag = new Boolean("true");
        System.out.println(n2);
        n2 = n1;    //装箱
        System.out.println(n2);

        boolean b = flag;//拆箱
        System.out.println(b);
    }
}
