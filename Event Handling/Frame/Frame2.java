import java.awt.*;
import java.awt.event.*;


public class Frame2 extends Frame //implements ActionListener 
{	Button btn1,btn2;

		public Frame2()
	{	

		FlowLayout f = new FlowLayout();
		this.setLayout(f);
		Label bl1 = new Label("This is Frame 2 ");
		btn1 = new Button("show Frame3");
		btn2 = new Button("show Frame1");

		// btn1.addActionListener(this);
		// btn2.addActionListener(this);

	}

}