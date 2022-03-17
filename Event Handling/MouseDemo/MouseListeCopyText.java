import java.awt.*;
import java.awt.event.*;

 class MouseListeCopyText extends Frame implements MouseListener,ActionListener
{
    Button btn;
    TextField tf1,tf2 ;
    public MouseListeCopyText()
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
        
        tf1.addMouseListener(this);
        btn.addActionListener(this);
        
       }
       public void actionPerformed(ActionEvent ae)
	{
		tf1.setText(null);
		tf2.setText(null);     
	}
       public void mouseEntered(MouseEvent me)
       {
           String s = tf1.getText();
           tf2.setText(s);
       }
       public void mouseExited(MouseEvent me)
       {
            //tf2.setText(null);
            //tf1.setText(null);
       }
       public void mouseReleased(MouseEvent me)
       {}
       public void mousePressed(MouseEvent me)
       {}
       public void mouseClicked(MouseEvent me)
       {}

  public static void main(String[] args) {
  MouseListeCopyText fr = new MouseListeCopyText();
  fr.setVisible(true);
  fr.setSize(400,400);
  fr.setTitle("DemonStraing Copy and Paste");
  } 
    
}