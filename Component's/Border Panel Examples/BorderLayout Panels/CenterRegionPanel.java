import java.awt.*;


class CenterRegionPanel extends Panel
{
	public CenterRegionPanel()
	{	
		setLayout(null);
		this.setBackground(new Color(44, 63, 79));

		Font f = new Font("Calibri",Font.PLAIN,16);
		this.setFont(f);
		Label lb1 = new Label("Username : ");
		lb1.setBounds(45,60,120,25);
		lb1.setForeground(Color.white);
		Label lb2 = new Label("Password : ");
		lb2.setBounds(45,120,120,25);
		lb2.setForeground(Color.white);
		Label lb3 = new Label("Confirm Password :");
		lb3.setBounds(45,180,140,25);
		lb3.setForeground(Color.white);
		TextField tf1 = new TextField("Useraname");
		tf1.setBounds(200,60,160,20);
		TextField tf2 = new TextField("Password");
		tf2.setBounds(200,120,160,20);
		TextField tf3 = new TextField("Confirm Password");
		tf3.setBounds(200,180,160,20);



		add(lb1);
		add(lb2);
		add(lb3);
		add(tf1);
		add(tf2);
		add(tf3); 	
		
		// add components for CENTER region here
	}
} 