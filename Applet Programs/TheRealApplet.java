import java.applet.*;
import java.awt.*;



public class TheRealApplet extends Applet 

{
   public void paint (Graphics g)	
    {

      g.setColor(Color.green);
      g.drawLine(99,99,400,400);
    
      g.drawRect(70,70,100,100);
      g.setColor(Color.orange);
      g.fillRect(101,101,99,99);
      g.setColor(Color.black);
      g.drawOval(70,70,80,80);
      g.setColor(Color.green);
      g.fillOval(85,85,79,79);
      g.setColor(Color.black);
      g.drawArc(101,101,120,95,100,100);

     int[] x= {10,160,200,160,10,120};
     int[] y= {140,140,230,160,320,115};
     g.drawPolygon(x,y,6);




    }
}