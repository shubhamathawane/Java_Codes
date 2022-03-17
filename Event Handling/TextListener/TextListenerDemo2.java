import java.awt.*;
import java.awt.event.*;

 class TextListenerDemo2 extends Frame implements TextListener,MouseListener
{
    Button btn;
    TextField tf1,tf2 ;
    public TextListenerDemo2()
    {
        // FlowLayout f =new FlowLayout();
        // this.setLayout(f);
        setLayout(null);
        tf1 = new TextField ();
        tf1.setBounds(100,100,140,25);
        tf2 = new TextField ();
        tf2.setBounds(100,150,140,25);
        btn = new Button("Sample");
        btn.setBounds(125,200,80,25); 
           

        tf2.setEditable(false);
        add(tf1);
        add(tf2);    
        add(btn);
        
        tf1.addTextListener(this);
        btn.addMouseListener(this);
      
        
       }
       public void textValueChanged(TextEvent te)
       {
           String s = tf1.getText();
           tf2.setText(s);
       }
       public void mouseEntered(MouseEvent me)
       {
            tf2.setText(null);
            tf1.setText(null);
       }
       public void mouseReleased(MouseEvent me)
       {}
       public void mousePressed(MouseEvent me)
       {}
       public void mouseClicked(MouseEvent me)
       {}
        public void mouseClicked(MouseEvent me)
       {}

  public static void main(String[] args) {
  TextListenerDemo2 fr = new TextListenerDemo2();
  fr.setVisible(true);
  fr.setSize(400,400);
  fr.setTitle("DemonStraing Copy and Paste");
  } 
    
}