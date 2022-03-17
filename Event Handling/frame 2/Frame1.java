import java.awt.*;
import java.awt.event.*;


public class Frame1 extends Frame implements ActionListener
{	
	Button btn1,btn2;
	public Frame1()
	{	

		FlowLayout f = new FlowLayout();
		this.setLayout(f);

		// Font f2 = new Font("Calibri",Font.PLAIN,15);
		// this.setFont(f2);

		Label bl1 = new Label("This is Frame 1 ");
		// bl1.setBounds(100,40,150,25);
		btn1 = new Button("show Frame2");
		// btn1.setBounds(40,200,100,25);
		
		btn2 = new Button("show Frame3");
		// btn2.setBounds(100,200,100,25);	
		
		


		add(bl1);
		add(btn1);
		add(btn2);

		btn1.addActionListener(this);
		btn2.addActionListener(this);

		
	}
	
	public void actionPerformed(ActionEvent te)
		{
			if(te.getSource() == btn1)
			{		

				Frame2 f2 = new Frame2();
				f2.setVisible(true);
				f2.setSize(400,200);				
				this.dispose();	
			}
			if(te.getSource() == btn2)
			{
				
				Frame3 f3 = new Frame3();
				f3.setVisible(true);
				f3.setSize(400,200);
				this.dispose();
			}
		}

	

	public class Frame2 extends Frame implements ActionListener
		{	Button btn1,btn2;

			public Frame2()
			{	

			FlowLayout f = new FlowLayout();
			this.setLayout(f);
			Label bl1 = new Label("This is Frame 2 ");
			btn1 = new Button("show Frame3");
			btn2 = new Button("show Frame1");

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
				f3.setSize(400,200);				
				this.dispose();	
			}
			if(te.getSource() == btn2)
			{
				
				Frame1 f1 = new Frame1();
				f1.setVisible(true);
				f1.setSize(400,200);
				this.dispose();
			}
 		}
 	}	



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
+
		}
		public void actionPerformed(ActionEvent te)
		{
			if(te.getSource() == btn1)
			{		

				Frame1 f1 = new Frame1();
				f1.setVisible(true);
				f1.setSize(400,200);				
				this.dispose();	
			}
			if(te.getSource() == btn2)
			{
				
				Frame2 f2 = new Frame2();
				f2.setVisible(true);
				f2.setSize(400,200);
				this.dispose();
			}
		 } 
	}

	
	public static void main(String[] args) {
		
		Frame1 nt = new Frame1();
		nt.setVisible(true);
		nt.setSize(400,400);
		nt.setTitle("Working on Frames");
	}
 }
