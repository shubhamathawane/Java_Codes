import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AddremoveDemo extends Frame 
{	
	Button btn1;
	TextField tf1;
	Choice ch1;
	Label lb1; 
	// String values[] = new String[10];
	// int j=0;
	public AddremoveDemo()
	{
		setLayout(null);
		//this.setFont(new Font("Calibri",Font.PLAIN,18));

		lb1 = new Label("This is Simple Text");
		lb1.setBounds(100,50,300,40);

		tf1 = new TextField();
		tf1.setBounds(50,90,120,25);
		
		btn1 = new Button("ADD/REMOVE");
		btn1.setBounds(175,90,150,25);
		
		
		ch1 = new Choice();
		
		
		ch1.add("India");
		ch1.add("Dubai");
		ch1.add("Australia");
		

		ch1.setBounds(80,150,125,25);

		
		

		

		add(lb1);
		add(tf1);
		add(btn1);
		add(ch1);

		btn1.addActionListener(new adding());
		btn1.addActionListener(new removing());
		

		

	}
	class adding implements ActionListener
	{
		public void actionPerformed(ActionEvent ae)
		{	
			
			

			

				ch1.add(tf1.getText()); 
				tf1.setText(null);
			}

			

	}
		
	class removing implements ActionListener
	{
		public void actionPerformed(ActionEvent ae)
		{		
			
				

		}
	}


	public static void main(String[] args) {
		AddremoveDemo chf = new AddremoveDemo();
		chf.setTitle("Demonstrating Events");
		chf.setSize(500,500);
		chf.setVisible(true);
	}
}