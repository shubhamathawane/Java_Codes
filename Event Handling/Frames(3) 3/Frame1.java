import java.awt.*;
import java.awt.event.*;

public class Frame1 extends Frame implements ActionListener
{		
			Button btn1,btn2;

			public Frame1()
			{	

			FlowLayout f = new FlowLayout();
			this.setLayout(f);
			Label bl1 = new Label("This is Frame 1 ");
			btn1 = new Button("show Frame3");
			btn2 = new Button("show Frame2");

			btn1.addActionListener(this);
			btn2.addActionListener(this);

			add(bl1);
			add(btn1);
			add(btn2);

		}

		public void actionPerformed(ActionEvent te)
		{
			if(te.getSource() == btn1)
			{		

				Frame3 f3 = new Frame3();
				f3.setVisible(true);
				f3.setBackground(Color.gray);
				f3.setSize(400,400);				
				this.dispose();	
			}
			if(te.getSource() == btn2)
			{
				
				Frame2 f2 = new Frame2();
				f2.setVisible(true);
				f2.setBackground(Color.yellow);
				f2.setSize(400,400);
				this.dispose();
			}
 	
		}
		
 }	
