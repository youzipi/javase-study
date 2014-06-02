import javax.swing.*;

/**
 * project_name:test
 * package_name:PACKAGE_NAME
 * user: Administrator
 * date: 14-6-1
 */
class MyFrame extends JFrame{
    public  MyFrame(String title){
        this.setTitle(title);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

public class JFrameDemo {

    public static void main(String[] args) {

        MyFrame frame = new MyFrame("我的第一个JAVA图形窗口");
        frame.setSize(400, 300);
        frame.setLocation(100, 100);
        frame.setVisible(true);//窗口可见性

    }
}
