import java.awt.*;
import java.awt.event.*;


public class Frame1 extends Frame 
{	Button btn1,btn2;
	public Frame1()
	{	

		FlowLayout f = new FlowLayout();
		this.setLayout(f);

		Label bl1 = new Label("This is Frame 1 ");
		btn1 = new Button("show Frame2");
		btn2 = new Button("show Frame3");

		btn1.addActionListener(new innerf1());
		btn2.addActionListener(new innerf2());

		add(bl1);
		add(btn1);
		add(btn2);



	}
	class innerf1 implements ActionListener
	{
		public void actionPerformed(ActionEvent te)
		{
			Frame2 f2 = new Frame2();
			f2.setVisible(true);
			f2.setSize(300,200);
			Frame1 f1 = new Frame1();
			f1.setVisible(false);
		}
	}

	class innerf2 implements ActionListener
	{
		public void actionPerformed(ActionEvent ae)
		{
			Frame3 f3 = new Frame3();
			f3.setVisible(true);
			f3.setSize(300,200);
			Frame2 f2 = new Frame2();
			f2.setVisible(false);
			f2.setSize(300,200);
		}
	}


	public class Frame2 extends Frame 
		{	Button btn1,btn2;

			public Frame2()
			{	

			FlowLayout f = new FlowLayout();
			this.setLayout(f);
			Label bl1 = new Label("This is Frame 2 ");
			btn1 = new Button("show Frame3");
			btn2 = new Button("show Frame1");

			btn1.addActionListener(new innerf23());
			btn2.addActionListener(new innerf21());

			add(bl1);
			add(btn1);
			add(btn2);

		}
	}

	class innerf23 implements ActionListener
	{
		public void actionPerformed(ActionEvent te)
		{
			Frame3 f3 = new Frame3();
			f3.setVisible(true);
			f3.setSize(300,200);
			Frame2 f2 = new Frame2();
			f2.setVisible(false);
			f2.setSize(300,200);
		}
	}

	class innerf21 implements ActionListener
	{
		public void actionPerformed(ActionEvent ae)
		{
			Frame1 f1 = new Frame1();
			f1.setVisible(true);
		}
	}



	public class Frame3 extends Frame 
		{	
			Button btn1,btn2;

			public Frame3()
			{	

			FlowLayout f = new FlowLayout();
			this.setLayout(f);
			Label bl1 = new Label("This is Frame 3 ");
			btn1 = new Button("show Frame1");
			btn2 = new Button("show Frame2");

			btn1.addActionListener(new innerf31());
			btn2.addActionListener(new innerf32());

			add(bl1);
			add(btn1);
			add(btn2);

		}
	}
	class innerf31 implements ActionListener
	{
		public void actionPerformed(ActionEvent te)
		{
			Frame1 f1 = new Frame1();
			f1.setVisible(true);
			f1.setSize(300,200);
			Frame3 f3 = new Frame3();
			f3.setVisible(false);
			f3.setSize(300,200);
		}
	}

	class innerf32 implements ActionListener
	{
		public void actionPerformed(ActionEvent ae)
		{
			Frame2 f2 = new Frame2();
			f2.setVisible(true);
			f2.setSize(300,200);
			Frame3 f3 = new Frame3();
			f3.setVisible(false);
			f3.setSize(300,200);
		}
	}
	

	public static void main(String[] args) {
		
		Frame1 nt = new Frame1();
		nt.setVisible(true);
		nt.setSize(400,400);
		nt.setTitle("Demonstrating New Trick of Inner Class ");
	}
}