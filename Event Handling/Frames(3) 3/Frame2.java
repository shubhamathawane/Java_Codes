import java.awt.*;
import java.awt.event.*;

public class Frame2 extends Frame implements ActionListener
		{	Button btn1,btn2;

			public Frame2()
			{	

			FlowLayout f = new FlowLayout();
			this.setLayout(f);
			Label bl1 = new Label("This is Frame 2 ");
			btn1 = new Button("show Frame3");
			btn2 = new Button("shows Frame1");

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
				
				Frame1 f1 = new Frame1();
				f1.setVisible(true);
				f1.setBackground(Color.red);
				f1.setSize(400,400);
				this.dispose();
			}
 	
		}
}