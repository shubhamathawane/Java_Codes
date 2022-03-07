import java.awt.*;


class BorderLayoutDemoF1 extends Frame
{
	public BorderLayoutDemoF1()
	{
		BorderLayout b = new BorderLayout();
		this.setLayout(b);

		TopRegionPanel trp = new TopRegionPanel();
		BottomRegionPanel brp = new BottomRegionPanel();
		CenterRegionPanel crp = new CenterRegionPanel();

		add(trp, BorderLayout.NORTH);
		add(brp, BorderLayout.SOUTH);
		add(crp, BorderLayout.CENTER);
	
	}	
	public static void main(String[] args) {

		BorderLayoutDemoF1 fr = new BorderLayoutDemoF1();
		
		fr.setVisible(true);
		fr.setTitle("Demonstrating BorderLayout");
		fr.setSize(500,500);

	}
}	