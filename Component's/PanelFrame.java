import java.awt.*;

class PanelFrame extends Frame 
{
		public PanelFrame()
		{	

			PanelDemo1 p1 = new PanelDemo1();

			add(p1);
			p1.setBounds(200,200,800,800);


		}


		public static void main(String[] args) {
			
			PanelFrame pf = new PanelFrame();
			pf.setSize(700,600);

			pf.setTitle("Tuition Registration");
			pf.setVisible(true);
		}

}
