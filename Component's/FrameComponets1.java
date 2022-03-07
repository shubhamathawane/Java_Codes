import java.awt.*;

public class FrameComponets1 extends Frame
{
	public FrameComponets1()
	{
	

		FlowLayout f1 = new FlowLayout();
		this.setLayout(f1);

		Font f = new Font("Arial",Font.PLAIN,18);
		this.setFont(f);


		TextField tf1 = new TextField("Clipboard");
		Button btn1 = new Button("Italic");
		btn1.setBounds(100,200,85,30);
		Button btn2 = new Button("Bold");
		btn2.setBounds(120,120,85,30);
		Button btn3 = new Button("Delete");
		btn3.setBounds(130,120,85,30);
		
		String s = "This is Text Editor";
		TextArea ta1 = new TextArea(s,7,75);
		Label lb1 = new Label("Text Editing Tools");
		TextArea ta2 = new TextArea("This text Area is Protected",7,75);		
		ta2.setEditable(false);



		add(lb1);
		add(btn1);
		add(btn2);
		add(btn3);
		add(ta1);
		add(tf1);
		add(ta2);
	} 	
public static void main(String arg[])
	{

		FrameComponets1 fc = new FrameComponets1();
		fc.setSize(400,400);
		fc.setVisible(true);
		fc.setTitle("Frame Components");
	}
		
}	

