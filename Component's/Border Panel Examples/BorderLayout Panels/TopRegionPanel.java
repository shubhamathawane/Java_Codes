import java.awt.*;

class TopRegionPanel extends Panel
{
	public TopRegionPanel()
	{
		this.setBackground(new Color(248, 148, 6));
		Label l1 = new Label("Login form");
		Font f = new Font("Arial",Font.BOLD,15);
		this.setFont(f);
		l1.setForeground(Color.white);


		add(l1);

	}
}