import java.awt.*;
import java.awt.event.*;


public class Frame3 extends Frame implements ActionListener
		{	
			Button btn1,btn2;

			public Frame3()
			{	

			FlowLayout f = new FlowLayout();
			this.setLayout(f);
			Label bl1 = new Label("This is Frame 3 ");
			btn1 = new Button("show Frame1");
			btn2 = new Button("show Frame2");

			btn1.addActionListener(this);
			btn2.addActionListener(this);

			add(bl1);
			add(btn1);
			add(btn2);

			//this.setVisible(true)


		}
		public void actionPerformed(ActionEvent te)
		{
			if(te.getSource() == btn1)
			{		

				Frame1 f1 = new Frame1();
				f1.setVisible(true);
				f1.setBackground(Color.red);
				f1.setSize(400,400);				
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
