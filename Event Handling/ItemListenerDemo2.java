import java.awt.*;
import java.awt.event.*;

public class ItemListenerDemo2 extends Frame implements ItemListener{
	Checkbox ch1,ch2,ch3,ch4;
	Label l1,l2,l3,l4;


	public ItemListenerDemo2(){

		//FlowLayout f= new FlowLayout();
		setLayout(null);

		ch1 = new Checkbox("Pizza");
		ch1.setBounds(40,100,100,50);
		ch2 = new Checkbox("Burger");
		ch2.setBounds(40,140,100,50);
		ch3 = new Checkbox("Pastry");
		ch3.setBounds(40,180,100,50);
		ch4 = new Checkbox("Cold Drink");
		ch4.setBounds(40,220,100,50);

		l1 = new Label();		
		l1.setBounds(200,100,120,50);
		l2 = new Label();
		l2.setBounds(200,140,120,50);
		l3 = new Label();
		l3.setBounds(200,180,120,50);
		l4 = new Label();
		l4.setBounds(200,220,140,50);


		


		add(ch1);add(ch2);add(l1);add(ch3);add(ch4);add(l2);add(l3);add(l4);

		ch1.addItemListener(this);
		ch2.addItemListener(this);
		ch3.addItemListener(this);
		ch4.addItemListener(this);

		
	}
	public void itemStateChanged(ItemEvent e)
	{
		if(e.getSource()==ch1)
			l1.setText("Pizza is "+(e.getStateChange()==1? "Checked " : "Unchecked")); //l1.setText("Pizza is "+(e.getStateChenge()==true? "Checked" : "Unchecked "));
		if(e.getSource() == ch2)
			l2.setText("Burger Is "+(e.getStateChange() == 1? "checked " : "Unchecked"));
		if(e.getSource()==ch3)
			l3.setText("Pastry is "+(e.getStateChange() == 1? "Checked"  : "Unchecked"));
		if(e.getSource()==ch4)
			l4.setText("Cold Drink is "+(e.getStateChange() == 1? "Checked"  : "Unchecked"));

	}

	public static void main(String[] args) {
		ItemListenerDemo2 fr =  new ItemListenerDemo2();
		fr.setSize(400,400);
		fr.setVisible(true);
	}
}