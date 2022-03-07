import java.awt.*;
import java.awt.event.*;

class Card1 extends Panel
{
	public Card1()
	{

		Label lb = new Label("Select Colors");
		Checkbox ch1 = new Checkbox("Red");
		Checkbox ch3 = new Checkbox("Blue");
		Checkbox ch4 = new Checkbox("Yellow");
		Checkbox ch2 = new Checkbox("Green");

		add(lb);add(ch1);add(ch2);add(ch3);add(ch4);
	}
}