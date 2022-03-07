import java.awt.*;

class TextFieldDemo1 extends Frame
{
	public TextFieldDemo1()
	{
		
		
		FlowLayout f1 = new FlowLayout();
		this.setLayout(f1);

		Font f = new Font("Arial", Font.BOLD,25);
		this.setFont(f);
		
		TextField tf1 = new TextField("Hello There");
		TextField tf2 = new TextField("Enter Password Here");
		TextField tf3 = new TextField(10);

		tf1.setEditable(false);  //will make 'tf1' as read only
		tf2.setEchoChar('*');
		

		add(tf1);
		add(tf2);
		add(tf3);
		
	}

public static void main(String ar[])
	{
		TextFieldDemo1 fr = new TextFieldDemo1();
		fr.setSize(400,400);
		fr.setVisible(true);
		fr.setTitle("Demonstrating TextField");
	}
}