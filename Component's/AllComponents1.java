import java.awt.*;
import java.applet.Applet;  



/* 
<applet code = AllComponents1 width=300 height=300>
</applet>
*/


public class AllComponents1 extends Applet
{  
  
	public void start()
	{  
		
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
  
}  


