import javax.swing.*;
import java.awt.*;

class JButtonJIconDemo extends JFrame
{
	public JButtonJIconDemo()
	{
		ImageIcon ii1 = new ImageIcon("add-icon-png-3.png");
		JButton jbtn1 = new JButton("Add",ii1);
		jbtn1.setSize(ii1.getIconWidth(), ii1.getIconHeight());
		jbtn1.setBounds(100,100,80,25);
		add(jbtn1);		
	}
	public static void main(String[] args) {
		JButtonJIconDemo fr = new JButtonJIconDemo();
		fr.setSize(300,300);
		fr.setVisible(true);
		fr.setTitle("JButtonJIconDemo");
	}
}