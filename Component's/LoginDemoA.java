import java.awt.*;
import java.applet.Applet;  



/* 
<applet code = LoginDemoA width=300 height=300>
</applet>
*/


public class LoginDemoA extends Applet
{  
  
	public void start()
	{  
		
				setLayout(null);
									
				Label lb1 = new Label("User");
				lb1.setBounds(20,40,80,25);

				TextField tf1 = new TextField(20);
				tf1.setBounds(100,40,160,25);

				Label lb2 = new Label("Password");
				lb2.setBounds(20,80,80,25);

				Label course = new Label("Course");
				course.setBounds(20,120,80,25);
			
				TextField tf2 = new TextField();
				tf2.setBounds(100,80,160,25);

				Checkbox ch1 = new Checkbox("java");
				ch1.setBounds(120,120,50,25);
				Checkbox ch2 =  new Checkbox("c++");
				ch2.setBounds(180,120,50,25);

				Button btn1 = new Button ("Login");
				btn1.setBounds(180,150, 80, 25);

				Button btn2 = new Button ("Register");
				btn2.setBounds(20,150,80,25);
				
				
				add(course);
				add(ch1);
				add(ch2);
				add(lb1);
				add(tf1);
				add(lb2);
				add(tf2);
				add(btn1);
				add(btn2);
				
				
	}  
  
}  


