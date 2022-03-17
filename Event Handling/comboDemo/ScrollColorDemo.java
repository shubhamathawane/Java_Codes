import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

/*
<applet code = ScrollColorDemo width = "900" height = "500">
</applet>
*/

public class ScrollColorDemo extends Applet implements AdjustmentListener,ActionListener
{
	Scrollbar s1,s2,s3;
	TextField tf1,tf2,tf3;
	Label lb1,lb2,lb3;
	Button btn1;
	Color c;
	
	public void start()//Graphics g)
	{

		

		
		setLayout(null);
		Font f = new Font("TimesRoman", Font.PLAIN, 16);
		this.setFont(f);


		lb1 = new Label("Select RED ratio");
		lb1.setBounds(20,240,170,25);
		lb2 = new Label("Select GREE ratio");
		lb2.setBounds(20,280,170,25);
		lb3 = new Label("Select BLUE ratio");
		lb3.setBounds(20,320,170,25);

		s1 = new Scrollbar(Scrollbar.HORIZONTAL, 0,1,0,256);
		s1.setBounds(150,240,300,25);

		s2 = new Scrollbar(Scrollbar.HORIZONTAL, 0,1,0,256);
		s2.setBounds(150,280,300,25);

		s3 = new Scrollbar(Scrollbar.HORIZONTAL, 0,1,0,256);
		s3.setBounds(150,320,300,25);


		tf1 = new TextField();
		tf1.setBounds(460,240,100,25);

		tf2 = new TextField();
		tf2.setBounds(460,280,100,25);

		tf3 = new TextField();
		tf3.setBounds(460,320,100,25);

		btn1 = new Button("check");
		btn1.setBounds(570,280,120,29);

		

		add(s1);
		add(s2);
		add(s3);
		add(tf1);
		add(tf2);
		add(tf3);
		add(lb1);
		add(btn1);
		add(lb2);
		add(lb3);

		s1.addAdjustmentListener(this);
		s2.addAdjustmentListener(this);
		s3.addAdjustmentListener(this);
		btn1.addActionListener(this);

 }
 	public void adjustmentValueChanged(AdjustmentEvent ae)
	{	
		

		
		tf1.setText(s1.getValue()+"");
		tf2.setText(s2.getValue()+"");
		tf3.setText(s3.getValue()+"");


		//Here also we can add getValue() method to directly change the color value 
	}
	public void paint(Graphics g)
	{	
		
		g.setColor(c);
		g.fillRect(250,70,250,100);
		

	}
	public void actionPerformed(ActionEvent ae)
	{	
		int x,y,z;

		x = s1.getValue();
		y = s2.getValue();
		z = s3.getValue();
		c = new Color(x,y,z);
		
		
		//setBackground(c);
		repaint();
				
	}
	
	
}
