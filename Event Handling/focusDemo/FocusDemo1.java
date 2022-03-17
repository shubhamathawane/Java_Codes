import java.awt.*;
import java.awt.event.*;


public class FocusDemo1 extends Frame implements FocusListener
{		

	Label lb1,lb2;
	TextField tf1,tf2,tf3;
	Button btn1;

		public FocusDemo1()
		{
		
		setLayout(null);
	

		tf1 = new TextField();
		tf1.setBounds(100,50,180,25);

		tf2 = new TextField();
		tf2.setBounds(100,100,180,25);

		 tf3 = new TextField();
		tf3.setBounds(100,150,180,25);

		btn1 = new Button("Verify");
		btn1.setBounds(115,200,150,25);

		lb1 = new Label();
		lb1.setBounds(130,240,200,25);

		lb2 = new Label();
		lb2.setBounds(130,270,200,25);


		add(tf1);add(tf2);add(tf3);add(lb1);add(lb2);add(btn1);

		tf1.addFocusListener(this);
		tf2.addFocusListener(this);
		tf3.addFocusListener(this);
		btn1.addFocusListener(this);
	}
	public void focusGained(FocusEvent fe)
	{	
		String s1 = "tf1";
		String s2 = "tf2";
		String s3 = "tf3";
		String s4 = "btn1";
		if(fe.getSource() == tf1)
		{
				lb1.setText("Focus is Gained By :  "+s1);
		} 
		if(fe.getSource() == tf2)
		{	
				lb1.setText("Focus is Gained By :  "+s2);
		}
		if(fe.getSource() == tf3)
		{
				lb1.setText("Focus is Gained By :  "+s3);
		}
		if(fe.getSource() == btn1)
		{
				lb1.setText("Focus is Gained By :  "+s4);
		}

	}
	public void focusLost(FocusEvent fe)
	{
		String s1 = "tf1";
		String s2 = "tf2";
		String s3 = "tf3";
		String s4 = "btn1";
		if(fe.getSource() == tf1)
		{
				lb2.setText("Focus is Lost By :  "+s1);
		} 
		if(fe.getSource() == tf2)
		{	
				lb2.setText("Focus is Lost By :  "+s2);
		}
		if(fe.getSource() == tf3)
		{
				lb2.setText("Focus is Lost By :  "+s3);
		}
		if(fe.getSource() == btn1)
		{
				lb2.setText("Focus is Lost By :  "+s4);
		}

		
	}

	public static void main(String[] args) {
		FocusDemo1 fd1 = new FocusDemo1();
		fd1.setVisible(true);
		fd1.setTitle("Demonstrating Focus Events");
		fd1.setSize(400,400);
	}
}
