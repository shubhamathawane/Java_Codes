import java.awt.*;
import java.awt.event.*;

 class MouseListeCopyText2 extends Frame implements ActionListener,MouseListener,TextEvent
{
    Button btn;
    TextField tf1,tf2 ;
    public MouseListeCopyText2()
    {
        // FlowLayout f =new FlowLayout();
        // this.setLayout(f);
        setLayout(null);
        tf1 = new TextField ();
        tf1.setBounds(100,100,140,25);
        tf2 = new TextField ();
        tf2.setBounds(100,150,140,25);
        btn = new Button("Copu/Reset");
        btn.setBounds(125,200,80,25); 
           

        tf2.setEditable(false);
        add(tf1);
        add(tf2);    
        add(btn);
        tf1.addTextEvent(this);
        btn.addMouseListener(this);
        btn.addActionListener(this);
        
        
       }
       public void textValueChanged(TextEvent te)
       {
           String s = tf1.getText();
           tf2.setText(s);
       }
       public void mouseExited(MouseEvent me)
       {
            
       }
       public void mouseReleased(MouseEvent me)
       {}
       public void mousePressed(MouseEvent me)
       {}
       public void mouseClicked(MouseEvent me)
       {    tf2.setText(null);
            tf1.setText(null);
        }
       public void mouseEntered(MouseEvent me)
       {}

  public static void main(String[] args) {
  MouseListeCopyText2 fr = new MouseListeCopyText2();
  fr.setVisible(true);
  fr.setSize(400,400);
  fr.setTitle("DemonStraing Copy and Paste");
  } 
    
}