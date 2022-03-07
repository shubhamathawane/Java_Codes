import java.awt.*;
import java.applet.Applet;

/* 
<applet code= "ButtonLabel" width = "300" height="300">
</applet
*/


public class ButtonLabel extends Applet
{
 	public void start()
	{ 
		Font f = new Font("Arail", Font.BOLD,18);
		setFont(f);

		Button btn1 = new Button();
		Button btn2 = new Button("Submit");
		Button btn3 = new Button("Reset");
		TextField tf1 = new TextField();
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(tf1);
	}
}
