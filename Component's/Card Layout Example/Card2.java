import java.awt.*;
import java.awt.event.*;

class Card2 extends Panel
{
	public Card2()
	{
		Label lb = new Label("Select Shape");
		CheckboxGroup gr = new CheckboxGroup();
		Checkbox ch1 = new Checkbox("Circle",true,gr);
		Checkbox ch2 = new Checkbox("Rectangle", false,gr);
		Checkbox ch3 = new Checkbox("Square", false,gr);
		Checkbox ch4 = new Checkbox("Triangle",false,gr);
		Checkbox ch5 = new Checkbox("Oval",false,gr);

		add(lb);add(ch1);add(ch3);add(ch2);add(ch4);add(ch5);	
	}
}