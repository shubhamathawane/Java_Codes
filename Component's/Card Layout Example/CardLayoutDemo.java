import java.awt.*;
import java.awt.event.*;

class CardLayoutDemo extends Frame
{
	public CardLayoutDemo()
	{
		FlowLayout f = new FlowLayout();
		this.setLayout(f);

		DeckPanel p = new DeckPanel();
		add(p); //<--- Adding DeckPanel into Frame
	}

	public static void main(String[] args) {
		CardLayoutDemo fr = new CardLayoutDemo();
		fr.setSize(400,400);
		fr.setTitle("Demonstrating CardLayout");
		fr.setVisible(true);
	}
}