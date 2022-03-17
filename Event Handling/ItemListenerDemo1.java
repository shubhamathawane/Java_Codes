import java.awt.*;
import java.awt.event.*;

public class ItemListenerDemo1 implements ItemListener{
	Checkbox ch1,ch2,ch3;
	Label l1;


	public ItemListenerDemo1(){
		Frame f = new Frame("CheckBox Example");
		l1 = new Label();

		l1.setAlignment(Label.CENTER);
		l1.setSize(400,100);
		ch1 = new Checkbox("Pune");
		ch1.setBounds(100,100,50,50);
		ch2 = new Checkbox("Mumbai");
		ch2.setBounds(100,150,80,50);

		f.add(ch1);f.add(ch2);f.add(l1);

		ch1.addItemListener(this);
		ch2.addItemListener(this);

		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public void itemStateChanged(ItemEvent e)
	{
		if(e.getSource()==ch1)
			l1.setText("Pune Is "+(e.getStateChange()==1? "Checked " : "Unchecked"));
		if(e.getSource() == ch2)
			l1.setText("Mumbai Is "+(e.getStateChange() == 1? "checked " : "Unchecked"));
	}

	public static void main(String[] args) {
		new ItemListenerDemo1();
	}
}