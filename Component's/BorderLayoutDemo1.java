import java.awt.*;


public class BorderLayoutDemo1 extends Frame
{
	public BorderLayoutDemo1()
	{
		Font f = new Font("Nirmala UI",Font.PLAIN,14);
		this.setFont(f);

		setLayout(new BorderLayout());
		Button btn1 = new Button("TOP ");
		Button btn2 = new Button("BOTTOM ");
		Button btn3 = new Button("LEFT ");
		Button btn4 = new Button("RIGHT ");
		TextField tf1 = new TextField("Center ");


		add(btn1, BorderLayout.NORTH); //<--- components of 'p1' are added in NORTH
		add(btn2, BorderLayout.SOUTH); //<--- components of 'p2' are added in SOUTH
		add(btn3, BorderLayout.WEST);  //<--- components of 'p3' are added in WEST
		add(btn4, BorderLayout.EAST);  //<--- components of 'p4' are added in EAST
		add(tf1, BorderLayout.CENTER); //<--- components of 'p5' are added in CENTER
	}

	public static void main(String[] args) {
		BorderLayoutDemo1 fr = new BorderLayoutDemo1();
		fr.setSize(500,250);
		fr.setVisible(true);
		fr.setTitle("Demonstrating BorderLayout");
	}
}