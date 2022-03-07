import java.awt.*;

class TopRegionPanel extends Panel
{
	public TopRegionPanel()
	{

		Label l1 = new Label("Welocme to Site");
		Font f = new Font("Arial",Font.PLAIN,15);
		this.setFont(f);


		add(l1);

	}
}

class BottomRegionPanel extends Panel
{
	public BottomRegionPanel()
	{
			Button btn1 = new Button("submit");
			Button btn2 = new Button("Reset");

			add(btn1);
			add(btn2);
	}
}

// class LeftRegionPanel extends Panel
// {
// 	public LeftRegionPanel()
// 	{
// 		// add components for LEFT/WEST region here
// 	}
// }

// class RightRegionPanel extends Panel
// {
// 	public RightRegionPanel()
// 	{
// 		// add components for RIGHT/EAST region here
// 	}
// }

class CenterRegionPanel extends Panel
{
	public CenterRegionPanel()
	{
		Label l1 = new Label("Username : ");
		Label l2 = new Label("Password : ");

		Textfield tf1 = new Textfield("Useraname");
		Textfield tf2 = new Textfield("Password");

		add(l1);
		add(l2);
		add(tf1);
		add(tf2);
		
		// add components for CENTER region here
	}
} 