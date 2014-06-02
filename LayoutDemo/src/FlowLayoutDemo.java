import javax.swing.*;
import java.awt.*;

/**
 * project_name:test
 * package_name:PACKAGE_NAME
 * user: Administrator
 * date: 14-6-1
 */
public class FlowLayoutDemo{

    public static void main(String[] args) {
        MyFrame frame = new MyFrame("我的windows窗体");

        JPanel pan = new JPanel();
        JButton btn1 = new JButton("按钮1");
        JButton btn2 = new JButton("按钮2");
        JButton btn3 = new JButton("按钮3");

        pan.setLayout(new FlowLayout(FlowLayout.RIGHT));
        //把按钮放到面板
        pan.add(btn1);
        pan.add(btn2);
        pan.add(btn3);
        //把面板放到窗口
        frame.add(pan);

        frame.setSize(600, 400);
        frame.setLocation(100,200);
        frame.setVisible(true);
    }
}