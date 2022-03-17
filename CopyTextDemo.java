import java.awt.*;
import java.awt.event.*;

 class CopyTextDemo extends Frame implements ActionListener
{
    Button btn;
    TextField tf1,tf2 ;
    public CopyTextDemo()
    {
        // FlowLayout f =new FlowLayout();
        // this.setLayout(f);
        setLayout(null);

        tf1 = new TextField ();
        tf1.setBounds(100,100,140,25);
        btn = new Button("Copy");
        btn.setBounds(125,150,90,25);
        tf2 = new TextField ();
        tf2.setBounds(100,200,140,25);
        add(tf1);
        add(btn);
        add(tf2);    
        
        btn.addActionListener(this);
        
       }
       public void actionPerformed(ActionEvent ae)
       {
           String s = tf1.getText();
           tf2.setText(s);
       }

  public static void main(String[] args) {
  CopyTextDemo fr = new CopyTextDemo();
  fr.setVisible(true);
  fr.setSize(400,400);
  fr.setTitle("DemonStraing Copy and Paste");
  } 
    
}