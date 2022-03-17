import java.awt.*;
import java.awt.event.*;

public class EventClass extends Frame 
{
	public static void main(String[] args) {

		Frame1 f1 = new Frame1();
		Frame2 f2 = new Frame2();
		Frame3 f3 = new Frame3(); 

		f1.setLayout(new FlowLayout());
		f2.setLayout(new FlowLayout());
		f3.setLayout(new FlowLayout());


		f1.setBackground(Color.red);
		f2.setBackground(Color.yellow);
		f3.setBackground(Color.gray);


		f1.setSize(400,400);
		f2.setSize(400,400);
		f3.setSize(400,400);

		Label l1 = new Label("This is Frame 1");
		Label l2 = new Label("This is Frame 2");
		Label l3 = new Label("This is Frame 3");

		f1.add(l1);
		f2.add(l2);
		f3.add(l3);

		Button btn1 = new Button("Show Frame 1");
		Button btn2 = new Button("Show Frame 1");
		
		
		f1.setVisible(true);
		// f2.setVisible(true);
		// f3.setVisible(true);



		// btn1.addActionListener(new inner1());
		// btn2.addActionListener(new inner2());
		// btn3.addActionListener(new inner3());

	}	

		// class inner1 implements ActionListener
		//  {
		// 	public void actionPerformed(ActionEvent ae)
		// 	{	
		// 	    Frame3 f3 = new Frame3();
		// 		f3.setVisible(true);

	 // 		}
		// }
		// class inner2 implements ActionListener
		//  {
		// 	public void actionPerformed(ActionEvent ae)
		// 	{	
		// 	    Frame2 f2 = new Frame2();
		// 		f2.setVisible(true);

	 // 		}
		// }
		

}