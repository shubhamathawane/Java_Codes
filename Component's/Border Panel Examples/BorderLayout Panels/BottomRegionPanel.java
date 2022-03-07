import java.awt.*;

class BottomRegionPanel extends Panel
{
	public BottomRegionPanel()
	{		

			Font f = new Font("Calibri",Font.PLAIN,16);
			this.setFont(f);

			Button btn1 = new Button("submit");
			btn1.setBackground(new Color(54, 184, 255));
			btn1.setForeground(Color.white);
			Button btn2 = new Button("Reset");
			btn2.setBackground(new Color(253, 57, 37));
			btn2.setForeground(Color.white);
			add(btn1);
			add(btn2);
	}
}