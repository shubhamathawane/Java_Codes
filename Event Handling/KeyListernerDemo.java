import java.awt.*;
import java.awt.event.*;

public class KeyListernerDemo extends Frame implements KeyListener
{
	Label l1;
	TextArea ta;
	KeyListernerDemo(){
		l1 = new Label();
		l1.setBounds(20,50,100,20);
		ta = new TextArea();
		ta.setBounds(20,80,300,300);

		ta.addKeyListener(this);

		add(l1);add(ta);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
	public void keyPressed(KeyEvent e)
	{
		l1.setText("Key Pressed ");
	}

	public void keyReleased(KeyEvent e)
	{
		l1.setText("Key Release");
	}
	public void keyTyped(KeyEvent e)
	{
		l1.setText("Key Typed");
	}

	public static void main(String[] args) {
		new KeyListernerDemo();
	}
}