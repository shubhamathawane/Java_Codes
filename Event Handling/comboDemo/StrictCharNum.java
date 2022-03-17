import java.awt.*;
import java.awt.event.*;

public class StrictCharNum extends Frame 
{
    Label lb1;
    TextField tf1;
    Button btn1;
    public StrictCharNum()
    {
          // FlowLayout f =new FlowLayout();
          // this.setLayout(f);
        setLayout(null);
        tf1 = new TextField ();
        tf1.setBounds(100,100,140,25);
        btn1 = new Button("Clear");
        btn1.setBounds(100,150,140,25);
        lb1 = new Label();
        lb1.setBounds(100,200,300,25); 
           

       
        add(tf1);
        
        add(lb1);
        add(btn1);
        
        tf1.addKeyListener(new num_only());
        btn1.addActionListener(new button());
      
        
       }
       class num_only extends KeyAdapter implements KeyListener
       {
            public void keyPressed(KeyEvent ke)
            {   
                String value = tf1.getText();
                int i = value.length();

                if(ke.getKeyChar() >='0' && ke.getKeyChar() <='9')
                {
                    tf1.setEditable(true);
                    lb1.setText("");
                }
                else{
                    tf1.setEditable(false);
                    lb1.setText("Enter only numbers between (0-9) ");
                }

            }
       }
       class button implements ActionListener
       {
            public void actionPerformed(ActionEvent ae)
            {
                tf1.setText(null);
            }
       }



       // public void textValueChanged(TextEvent te)
       // {
       //     String s = tf1.getText();
       //     tf2.setText(s);
       // }
       // public void mouseEntered(MouseEvent me)
       // {
       //      tf2.setText(null);
       //      tf1.setText(null);
       // }
       // public void mouseReleased(MouseEvent me)
       // {}
       // public void mousePressed(MouseEvent me)
       // {}
       // public void mouseClicked(MouseEvent me)
       // {}
       //  public void mouseExited(MouseEvent me)
       // {}

  public static void main(String[] args) {
  StrictCharNum fr = new StrictCharNum();
  fr.setVisible(true);
  fr.setSize(400,400);
  fr.setTitle("Demonstrating Input");
  } 
    
}