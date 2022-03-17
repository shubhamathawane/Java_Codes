import java.awt.*;
import java.awt.event.*;

class MyDemoDialog extends Dialog
{
	public MyDemoDialog(Frame prnt, String title, boolean m)
	{
		super(prnt, title, m); // sending 3 parameters to para. contr. of 'Dialog'

		this.setLayout(new FlowLayout() );
		this.setFont(new Font("Arial", Font.BOLD, 15));
		
		Label lb1 = new Label("Confirm close operation? ");
		add(lb1);

		Button btn1 = new Button("Yes");
		add(btn1);
		
		Button btn2 = new Button("No");
		add(btn2);
	}
}
class MyDemoFrame extends Frame implements ActionListener
{
	public MyDemoFrame()
	{
		this.setLayout(new FlowLayout());
		this.setFont(new Font("Arial", Font.BOLD, 15));

		Button btn1 = new Button("Close");
		add(btn1);

		btn1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		MyDemoDialog d = new MyDemoDialog(this, "Confirm Closing", true);
		d.setSize(250,100);
		d.setVisible(true);
	}



	public static void main(String ar[])
	{
		MyDemoFrame fr = new MyDemoFrame();
		fr.setVisible(true);
		fr.setSize(500,500);
		fr.setTitle("This is Parent Frame");
	}
}