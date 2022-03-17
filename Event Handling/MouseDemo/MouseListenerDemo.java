import java.awt.*;
import java.awt.event.*;

public class MouseListenerDemo extends Frame implements MouseListener{
	//Checkbox ch1,ch2,ch3,ch4;
	Label l1;
	


	public MouseListenerDemo(){

		//FlowLayout f= new FlowLayout();
		setLayout(null);

		Button btn1 = new Button("Testing");
		btn1.setBounds(50,50,80,50);


		// ch1 = new Checkbox("Pizza");
		// ch1.setBounds(40,100,100,50);
		// ch2 = new Checkbox("Burger");
		// ch2.setBounds(40,140,100,50);
		// ch3 = new Checkbox("Pastry");
		// ch3.setBounds(40,180,100,50);
		// ch4 = new Checkbox("Cold Drink");
		// ch4.setBounds(40,220,100,50);

		l1 = new Label();		
		l1.setBounds(200,100,120,50);
		

		add(l1);
		add(btn1);



		//add(ch1);add(ch2);add(l1);add(ch3);add(ch4);add(l2);add(l3);add(l4);

		btn1.addMouseListener(this);
		

		
	}
	public void mouseEntered(MouseEvent me)
	{
		String s = "Entered";
		 l1.setText("mouse is "+s);
		
	}
	public void mouseExited(MouseEvent me)
	{
		String s = "Exited";
		 l1.setText("mouse is "+s);
		
	}
	public void mousePressed(MouseEvent me)
	{
		String s = "Pressed";
		 l1.setText("mouse is "+s);
		
	}public void mouseClicked(MouseEvent me)
	{
		String s = "Clicked";
		 l1.setText("mouse is "+s);
		
	}public void mouseReleased(MouseEvent me)
	{
		String s = "Release";
		 l1.setText("mouse is "+s);
		
	}

	public static void main(String[] args) {
		MouseListenerDemo fr =  new MouseListenerDemo();
		fr.setSize(400,400);
		fr.setVisible(true);
	}
}