import java.applet.Applet;  
import java.awt.*;
import java.awt.Graphics;  
/*
<Applet code = "ThreeRectsApplet" width="300" hight="300">
</Applet>
*/

public class ThreeRectsApplet extends Applet
{  
   public void init()
 {
   setBackground(Color.PINK);
   }
  public void paint(Graphics g)
   {  
    g.setColor(Color.ORANGE);
    g.fillRect(40,40,40,30);  
     g.setColor(Color.WHITE);
    g.fillRect(40,90,40,30);  
    g.setColor(Color.GREEN);
    g.fillRect(40,140,40,30);



   }
}
