import java.awt.*;
import java.awt.event.*;

public class NewTrick extends Frame 
{
	Button btn1;
	//Label lb1;
	TextField tf1,tf2;
	public NewTrick()
	{
		FlowLayout f = new FlowLayout();
		this.setLayout(f);

		 btn1 = new Button("Button 1");
		// btn2 = new Button("Button 2");
		// btn3 = new Button("Button 3");
		// lb1 = new Label();

		tf1 = new TextField();
		tf2 = new TextField();
		tf2.setEditable(false);

		add(tf1);add(tf2);
		add(btn1);


		tf1.addTextListener(new inner1());
		btn1.addActionListener(new inner2());
		

	}
	class inner1 implements TextListener
	{
		public void textValueChanged(TextEvent te)
		{
			
		}
	}

	class inner2 implements ActionListener
	{
		public void actionPerformed(ActionEvent ae)
		{
			String a = tf1.getText();
			tf2.setText(a);
		}
	}

	public static void main(String[] args) {
		NewTrick nt = new NewTrick();
		nt.setVisible(true);
		nt.setSize(400,400);
		nt.setTitle("Demonstrating New Trick of Inner Class ");
	}
}