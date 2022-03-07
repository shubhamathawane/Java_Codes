import java.awt.*;
import java.awt.event.*;

class DeckPanel extends Panel implements ActionListener
{
	CardLayout cl;

	public DeckPanel()
	{
		cl = new CardLayout();
		this.setLayout(cl);

		//We prepare 3 controllers here

		Button btn1 = new Button("Show Card-1");
		Button btn2 = new Button("Show Card-2");
		Button btn3 = new Button("Show Card-3");


		//and add 3 Cards here

		Card1 c1 = new Card1();
		Card2 c2 = new Card2();
		Card3 c3 = new Card3();

		//adding 3 controllers to switch between cards
		add(btn1);add(btn2);add(btn3);

		//Adding cards with new signature 

		add(c1,"MyFirstCard");
		add(c2,"MySecondCard");
		add(c3,"MyThirdCard");
		add(Deck);

		//registering controller for ActionListener

		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);

	}

	public void actionPerformed(ActionEvent ae)
	{
		//here we will switch between cards, based on controller's click

		String s = ae.getActionCommand();

		if(s.equals("Show Card-1"))
		{
			//means user clicked on "show Card-1"
			//here we have to shwo card1
			cl.show(this, "MyFirstCard");
		}
		else if(s.equals("Show Card-2"))
		{
			//means user clicked on "Show Card-2"
			//here we have to show card2
			cl.show(this, "MySecondCard");
		}
		else if (s.equals("Show Card-3"))
		{
			//means user clicked on "show Card-3"
			//here we have to show Card-3
			cl.show(this,"MyThirdCard");
		}
	}
}