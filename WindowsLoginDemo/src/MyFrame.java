import javax.swing.JFrame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class MyFrame extends JFrame implements WindowListener{

	public MyFrame (String title)
	{
		this.setTitle(title);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {


    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
