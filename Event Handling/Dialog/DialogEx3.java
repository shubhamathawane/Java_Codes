import java.awt.*;
import java.awt.event.*;


public class DialogEx3 extends WindowAdapter implements ActionListener
{
Frame frame;
Label label1;
TextField field1;
Button button1, button2, button3;
Dialog dg;

DialogEx3()
{
frame = new Frame("Frame");
button1 = new Button("Open Modeless Dialog");


label1 = new Label("Click on the button to open a Modal Dialog");

frame.add(label1);
frame.add(button1);

button1.addActionListener(this);
frame.pack();

frame.setLayout(new FlowLayout());
frame.setSize(330,250);
frame.setVisible(true);
}

public void actionPerformed(ActionEvent ae)
{

if(ae.getActionCommand().equals("Open Modeless Dialog"))
{
//Creating a Modeless Dialog which doesn't block the other parts of application
dg= new Dialog(frame,"Modeless Dialog");
Label label= new Label("You need not to close this dialog window to use the Frame Window",Label.CENTER);
dg.add(label);
dg.addWindowListener(this);
dg.pack();
dg.setLocationRelativeTo(frame);
dg.setLocation(new Point(100,100));
dg.setSize(400,200);
dg.setVisible(true);
}
}

public void windowClosing(WindowEvent we)
{
dg.setVisible(false);
}


public static void main(String...ar)
{
new DialogEx3();
}

}