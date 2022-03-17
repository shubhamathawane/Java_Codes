import java.awt.*;

import java.awt.event.*;

public class AddtionDemo extends Frame implements ActionListener
	

{	
	TextField tf1,tf3,tf2,tf4,tf5,tf6;

	public AddtionDemo()
		{
				FlowLayout f= new FlowLayout();
				this.setLayout(f);
 
				
				 tf1 = new TextField("Enter num 1");
				 tf2 = new TextField("Enter num 2");
				 tf3 = new TextField(" ");
				 tf4 = new TextField(" ");
				 tf5 = new TextField(" ");
				 tf6 = new TextField(" ");
				 Button btn1 = new Button("Perform");
			

				add(tf1);
				add(tf2);
				add(btn1);
				add(tf3);
				add(tf4);
				add(tf5);
				add(tf6);

				btn1.addActionListener(this);
				
		}
	

	public void actionPerformed(ActionEvent ae)
	{	
			
			// String s1 =  ;
			// String s2 = tf2.getText();

		int a = Integer.parseInt(tf1.getText());
		int b = Integer.parseInt(tf2.getText());
		int c = a +b;
		int d = a /b;
		int e = a *b;
		int f = a -b;
		tf3.setText(c + "");
		tf4.setText(d + "");
		tf5.setText(e + "");
		tf6.setText(f + "");
		

	}

public static void main(String[] args) {

	AddtionDemo fr = new AddtionDemo();
	fr.setVisible(true);
	fr.setSize(400,400);
	fr.setTitle("tAddtion Demo");
  } 
}