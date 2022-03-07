import java.awt.*;
import java.applet.Applet;



/*
<applet code=PanelApplet width=600 height=600>
</applet>
*/

public class PanelApplet extends Applet
{

	public void start()
	{

		    PanelDemo1 pd1 = new PanelDemo1();
			add(pd1);
			pd1.setLocation(200,200);
			pd1.setSize(600,600);
			pd1.setTitle("Tuition Registration");

			

	}

}
