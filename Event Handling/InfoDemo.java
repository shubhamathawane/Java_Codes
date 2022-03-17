import java.awt.*;

import java.awt.event.*;

public class InfoDemo extends Frame implements ActionListener
	

{	
	TextField tf1,tf2;
	Choice ch1;
	Label lb1,lb2,lb3;
	Button btn1;
	public InfoDemo()
		{
				setLayout(null);
 
				
				 tf1 = new TextField("");
				 tf1.setBounds(100,80,150,25);
				 tf2 = new TextField("");
				 tf2.setBounds(100,120,150,25);
				 ch1 = new Choice();
				 ch1.setBounds(100,160,80,25);
				 ch1.add("India");
				 ch1.add("US");
				 ch1.add("Australia");
				 ch1.add("England");
				 ch1.add("Russia");
				 lb1= new Label();
				 lb1.setBounds(110,240,150,25);
				 lb2 = new Label();
				 lb2.setBounds(110,280,150,25);
				 lb3 = new Label();
				 lb3.setBounds(110,320,150,25);

				btn1 = new Button("Fetch data");
				btn1.setBounds(100,200,100,25);

				
				add(tf1);add(tf2);add(ch1);add(btn1);
				add(lb1);add(lb2);add(lb3);
				
				


				

				btn1.addActionListener(this);
				
		}
	

	public void actionPerformed(ActionEvent ae)
	{	
			
		

		String s1 = tf1.getText();
		String s2 = tf2.getText();
		String s3 = ch1.getSelectedItem();

		lb1.setText("First name : "+s1);
		lb2.setText("Last name  : "+s2);
		lb3.setText("Country is : "+s3);
				
	}

public static void main(String[] args) {

	InfoDemo fr = new InfoDemo();
	fr.setVisible(true);
	fr.setSize(400,400);
	fr.setTitle("Info Demo");
  } 
}