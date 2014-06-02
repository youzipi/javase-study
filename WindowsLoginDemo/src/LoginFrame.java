import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * project_name:test
 * package_name:PACKAGE_NAME
 * user: Administrator
 * date: 14-6-2
 */
public class LoginFrame extends MyFrame implements ActionListener{

    int width=300; //窗体的宽度
    int height=200;//高度

    public  LoginFrame(String title){
        super(title);



        JPanel pan = new JPanel();
        pan.setLayout(new BorderLayout());

        JPanel title_pan = new JPanel();
        JLabel title_lab = new JLabel("系统登录",SwingConstants.CENTER);
        title_lab.setFont(new Font("隶书",Font.BOLD,20));
        title_pan.add(title_lab);

        JPanel button_pan = new JPanel();
        JButton login_btn = new JButton("登陆");
        JButton cancel_btn = new JButton("取消");
        login_btn.addActionListener(this);
        cancel_btn.addActionListener(this);
        button_pan.add(login_btn);
        button_pan.add(cancel_btn);


        JPanel content_pan = new JPanel();
        content_pan.setLayout(new GridLayout(2, 1));
        JPanel username_pan = new JPanel();
        JPanel password_pan = new JPanel();
        JLabel username_lab = new JLabel("用户名",SwingConstants.RIGHT);
        JLabel password_lab = new JLabel("密码",SwingConstants.RIGHT);
        JTextField username = new JTextField();
        JPasswordField password = new JPasswordField();
        username.setColumns(15);
        password.setColumns(15);

        username_pan.add(username_lab);
        username_pan.add(username);
        password_pan.add(password_lab);
        password_pan.add(password);
        content_pan.add(username_pan);
        content_pan.add(password_pan);

        pan.add(title_pan,BorderLayout.NORTH);
        pan.add(button_pan,BorderLayout.SOUTH);
        pan.add(content_pan,BorderLayout.CENTER);

        this.add(pan);



        this.setSize(width, height);
        int screen_width = (int)this.getToolkit().getScreenSize().getWidth(); //得到屏幕的宽度
        int screen_height = (int)this.getToolkit().getScreenSize().getHeight(); //得到屏幕的高度
        this.setLocation((screen_width-width)/2, (screen_height-height)/2);
        this.setResizable(false);//不可改大小
        this.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton)e.getSource();
        if(btn.getText().equals("登陆")){
            MainFrame mainFrame = new MainFrame("学生管理系统");
            this.setVisible(false);
        }
        else {
            System.exit(0);
        }

    }
}
