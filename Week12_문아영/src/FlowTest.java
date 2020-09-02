import javax.swing.*;
import java.awt.*;

class Flow extends JFrame{
	public Flow() {
		setTitle("test");
		JPanel panel=new JPanel();
		setSize(400,300);
		panel.setLayout(new FlowLayout());
		panel.add(new JButton("hi"));
		panel.add(new JButton("bye"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(panel);
		setVisible(true);
		
	}
}
public class FlowTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Flow test=new Flow();
	}

}
