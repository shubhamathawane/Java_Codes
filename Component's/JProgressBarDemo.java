import java.awt.*;
import javax.swing.*;
import java.applet.Applet;



public class JProgressBarDemo extends JFrame
{
	JFrame f;
	JProgressBar b;
	public static void main(String[] args) {
		
		f = new JFrame("ProgressBar Demo");
		JPanel p = new JPanel();
		b = new JProgressBar();
		b.setValue(0);
		b.setStringPainted(true);
		p.add(b);
		f.add(p);
		f.setSize(500,550);
		f.setVisible(true);
		fill();
	}
	public static void fill()
	{
		int i = 0;
		try
		{
			while(i<=100)
			{
				b.setValue(i);
				Thread.sleep(1000);
				i+=20;}
		}catch(Exception e){}


	}
}