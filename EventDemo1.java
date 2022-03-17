import java.awt.*;

import java.awt.event.*;

public class EventDemo1 extends Frame implements ActionListener,FocusListener
	

{	
	Label lb1;
	public EventDemo1()
		{
			FlowLayout f= new FlowLayout();
				this.setLayout(f);

				lb1 = new Label();

		
				Button btn1 = new Button("click me");
				add(btn1);
				Button btn2 = new Button("FocusLister Button");
				add(btn2);
				add(lb1);

				btn1.addActionListener(this);
				btn2.addFocusListener(this);
		}
	public void focusGained(FocusEvent fe)
	{
		System.out.println("Focus Gained ");
		lb1.setText("Focus is Gained");
	}
	public void focusLost(FocusEvent fe)
	{
		System.out.println("Focus Lost");
		lb1.setText("Focus is Gained");

	}


	public void actionPerformed(ActionEvent ae)
	{
		lb1.setText("Button Clicked");

		System.out.println("Button clicked");
	}

public static void main(String[] args) {

	EventDemo1 fr = new EventDemo1();
	fr.setVisible(true);
	fr.setSize(399,399);
	fr.setTitle("this is KeyEvent");
  } 
}