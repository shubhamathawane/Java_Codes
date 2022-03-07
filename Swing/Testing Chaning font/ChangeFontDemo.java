import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ChangeFontDemo extends Frame implements ActionListener
{	
	Button btn1;
	JLabel lb1;
	Choice ch1;
	Choice chs1;
	Choice chz1;
	

	public ChangeFontDemo()
	{
		setLayout(null);
		

		lb1 = new JLabel("This is Simple Text");
		lb1.setBounds(100,50,200,15);

		

		
		ch1.add("Nirmala UI");
		ch1.add("Times New Roman");
		ch1.add("Arial");
		ch1.add("Century Gothic");
		ch1.setBounds(20,100,125,25);

		
		chs1.add("ITALIC");
		chs1.add("BOLD");
		chs1.add("PLAIN");
		chs1.setBounds(155,100,95,25);

		chz1.add("20");
		chz1.add("25");
		chz1.add("30");
		chz1.setBounds(270,100,50,25);

		btn1 = new Button("Apply");
		btn1.setBounds(150,150,50,25);

		add(lb1);
		add(ch1);
		add(chs1);
		add(chz1);
		add(btn1);

		btn1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{	

		String s = ch1.getSelectedItem();
		int style = 2;
		Font f;

		if(chs1.getSelectedItem()=="ITALIC")
		{
			style = 0;
		}
		if(chs1.getSelectedItem()=="BOLD")
		{
			style = 1;
		}
		if(chs1.getSelectedItem()=="PLAIN")
		{
			style = 2;
		}

		int size = Integer.parseInt(chz1.getSelectedItem());
		
		f = new Font(s,style,size);

		lb1.setFont(f);
	}

	public static void main(String[] args) {
		ChangeFontDemo chf = new ChangeFontDemo();
		chf.setTitle("Demonstrating Events");
		chf.setSize(500,500);
		chf.setVisible(true);
	}
}