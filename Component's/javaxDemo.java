import java.applet.Applet;
import javax.swing;
import java.awt.*;

class javaxDemo  extends JApplet{

	public javaxDemo()
	{

		JTabbedPane jtp = new JTabbedPane();
		jtp.addTab("Languages",new LangPane());
		jtp.addTab("Colors",new ColorPane());
		jtp.addTab("Country", new CountryPane());

		getContentPane().add(jtp);
	}

	class LangPane extends JPanel
	{
		public LangPane();{
		JButton b1 = new JButton("Marathi");
		add(b1);
		JButton b2 = new JButton("Hindi");
		add(b2);
		JButton b3 = new JButton("English");
			}
	}

	class ColorPane extends JPanel
	{

		public ColorPane(){

			JCheckBox cb1 = new JCheckBox("Red");
			add(cb1);
			JCheckBox cb2 = new JCheckBox("Green");
			add(cb2);
			JCheckBox cb3 = new JCheckBox("Yellow");
			add(cb3);
		}

	}

	class CountryPane extends JPanel
	{
		public CountryPane(){
			JComboBox jcb = new JComboBox();
			jcb.addItem("India");
			jcb.addItem("USA");
			jcb.addItem("Uk");
			add(jcb);

		}
	}

	public static void main(String[] args) {
		javaxDemo jxd = new javaxDemo();
		jxd.add();
		jxd.setVisible(true);
		jxd.setLocation(300,300);
		jxd.setSize(300,300);
		
	}

}