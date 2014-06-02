import javax.swing.*;
import java.awt.*;

/**
 * project_name:test
 * package_name:PACKAGE_NAME
 * user: Administrator
 * date: 14-6-2
 */
public class JLabelDemo {

    public static void main(String[] args) {
        MyFrame frame = new MyFrame("我的windows窗体");
        frame.setSize(600,400);
        frame.setLocation(100, 100);
        frame.setVisible(true);

        JPanel pan = new JPanel();
        Icon ico = new ImageIcon("park.jpg");
        JLabel lab = new JLabel("Welcome!\n欢迎！",ico,SwingConstants.CENTER);
        lab.setFont(new Font("微软雅黑", Font.BOLD,40));

        pan.add(lab);
        frame.add(pan);
    }
}
