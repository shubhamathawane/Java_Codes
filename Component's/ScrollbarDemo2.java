import java.awt.*;
import java.awt.event.*;

class ScrollbarDemo2 extends Frame implements AdjustmentListener
{
	Scrollbar s;
	Label lb;
	public ScrollbarDemo2(){

		this.setLayout(null);
		Font f = new Font("Arial", Font.PLAIN,20);
		this.setFont(f);


		s = new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,101);
		lb = new Label("See Scrollbar value here ");

		s.setSize(300,35);
		s.setLocation(10,100);

		lb.setSize(300,35);
		lb.setLocation(10,150);

		add(s);
		add(lb);

		s.addAdjustmentListener(this);
	}

	public void adjustmentValueChanged(AdjustmentEvent ae)
	{

		// this method exrecutes whenever value of scrollbar changes 

		int s_val = s.getValue();
		lb.setText("Value = " + s_val);

	}

	public static void main(String ar[])
	{
		ScrollbarDemo2 fr = new ScrollbarDemo2();
		fr.setSize(400,400);
		fr.setTitle("Demonstrating Event on Scollbar");
		fr.setVisible(true);
	}
}
