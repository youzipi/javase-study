import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.net.URL;

public class MainFrame extends MyFrame{

    int width=600; //窗体的宽度
    int height=400;//高度

    public MainFrame(String title){
        super(title);

        this.setSize(width, height);

        //如何给窗体设置自定义的图标
        //得到图片的路径
        URL url = this.getClass().getResource("/pic/rsso.gif");
        //创建图片对象
        Image img = this.getToolkit().getImage(url);
        //设置窗体的图标
        this.setIconImage(img);

        //首先创建菜单栏
        JMenuBar bar = new JMenuBar();

        //创建文件菜单
        JMenu fileMenu = new JMenu("文件");
        fileMenu.setIcon(new ImageIcon("pic/file.gif"));

        //创建菜单子项
        JMenuItem newItem = new JMenuItem("新建",new ImageIcon("pic/folder.gif"));
        //设置快捷键
        newItem.setMnemonic('N');
        //设置组合键
        newItem.setAccelerator(KeyStroke.getKeyStroke('N', java.awt.event.KeyEvent.CTRL_MASK));

        newItem.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                JOptionPane.showConfirmDialog(null, "您点击了新建菜单项", "提示信息", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_OPTION);

            }
        });

        JMenuItem openItem = new JMenuItem("打开");
        JMenuItem saveItem = new JMenuItem("保存");
        JMenuItem quitItem = new JMenuItem("退出");

        quitItem.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                int result =	JOptionPane.showConfirmDialog(null, "您真的要退出系统吗？", "提示信息", JOptionPane.OK_CANCEL_OPTION, JOptionPane.OK_CANCEL_OPTION, new ImageIcon("pic/tip.gif"));
                if(result==JOptionPane.OK_OPTION)
                {
                    System.exit(0); //退出系统
                }
                else
                {
                    return;
                }
            }

        });

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        //添加分隔符
        fileMenu.addSeparator();
        fileMenu.add(saveItem);
        fileMenu.add(quitItem);



        //如何让窗体显示在屏幕中央
        int screen_width = (int)this.getToolkit().getScreenSize().getWidth(); //得到屏幕的宽度
        int screen_height = (int)this.getToolkit().getScreenSize().getHeight(); //得到屏幕的高度

        bar.add(fileMenu);
        //给窗体添加菜单栏
        this.setJMenuBar(bar);

        this.addWindowListener(this);

        this.setLocation((screen_width-width)/2, (screen_height-height)/2);
        this.setResizable(false);
        this.setVisible(true);

    }

    @Override
    public void windowClosing(WindowEvent e) {
        int result = JOptionPane.showConfirmDialog(null, "您真的要退出系统吗？", "提示信息", JOptionPane.OK_CANCEL_OPTION, JOptionPane.OK_CANCEL_OPTION, new ImageIcon("pic/tip.gif"));
        if(result==JOptionPane.OK_OPTION){
            System.exit(0); //退出系统
        }
        else{
            this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);            ;
        }

    }
}
