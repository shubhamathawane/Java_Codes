import java.awt.*;

class CheckBoxDemo1 extends Frame
{
	public CheckBoxDemo1()
	{
		FlowLayout f1 = new FlowLayout();
		this.setLayout(f1);


		Font f = new Font("Arial", Font.PLAIN,17);
		this.setFont(f);

		Choice oss = new Choice();
		Choice so = new Choice();


		so.add("Android");
		so.add("AppleIOS");
		so.add("WindowsOS");
		so.add("linusOs");

		oss.add("Wndows XP"); 
		oss.add("Kali Linux"); 
		oss.add("MacOS"); 
		oss.add("Red Hat Os"); 


		add(so);
		add(oss);


	}

	public static void main(String args[])
	 {
				CheckBoxDemo1 cb = new CheckBoxDemo1();
				cb.setSize(400,400);
				cb.setVisible(true);
				cb.setTitle("Demonstrating TextField");
		 }	


}