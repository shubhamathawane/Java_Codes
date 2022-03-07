import java.awt.*;
import java.awt.event.*;

class Card3 extends Panel
{
	public Card3()
	{
		Label lb = new Label("Select Country");

		Choice ch = new Choice();

		ch.add("India");
		ch.add("Australia");
		ch.add("United States");
		ch.add("England");
		ch.add("Russia");
		ch.add("France");
		ch.add("swetzerland");


		add(ch); add(lb);
	}
}