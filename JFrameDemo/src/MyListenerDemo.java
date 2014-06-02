/**
 * project_name:test
 * package_name:PACKAGE_NAME
 * user: Administrator
 * date: 14-6-1
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * project_name:test
 * package_name:PACKAGE_NAME
 * user: Administrator
 * date: 14-6-1
 */

class OutterClass implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showConfirmDialog(null, "test 按钮被点击", "提示消息", JOptionPane.YES_NO_CANCEL_OPTION);


    }
}

class MyJFrame extends JFrame implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showConfirmDialog(null, "test 按钮被点击", "提示消息", JOptionPane.YES_NO_CANCEL_OPTION);
    }

    //内部静态类
    static  class InnerClass implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showConfirmDialog(null, "test 按钮被点击", "提示消息", JOptionPane.YES_NO_CANCEL_OPTION);
        }

    }
    public  MyJFrame(String title){
        this.setTitle(title);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel pan = new JPanel();//面板
        JButton button = new JButton("test button");
        this.add(pan);
        pan.add(button);
        //1.匿名内部类（常用）
/*      button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(null, "test 按钮被点击", "提示消息", JOptionPane.YES_NO_CANCEL_OPTION);
            }
        });*/
        //2
        //button.addActionListener(new InnerClass());
        //3.外部类实现
        //button.addActionListener(new OutterClass());
        //4.实现监听器接口（常用）
        button.addActionListener(this);
    }
}

public class MyListenerDemo {

    public static void main(String[] args) {

        MyJFrame frame = new MyJFrame("我的第一个JAVA图形窗口");
        frame.setSize(400, 300);
        frame.setLocation(100, 100);
        frame.setVisible(true);//窗口可见性

    }
}
