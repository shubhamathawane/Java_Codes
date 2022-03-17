import java.awt.*;
import java.awt.event.*;

 class QueueDemo extends Frame
{   
    Label lb1;
    Button btn1,btn2,btn3;
    TextField tf1,tf2;
    TextArea ta1;
    String values[] = new String[10];
    int j = 0;
    public QueueDemo()
    {
        // FlowLayout f =new FlowLayout();
        // this.setLayout(f);
        

        setLayout(null);
        tf1 = new TextField ();
        tf1.setBounds(370,100,100,28);
       
        lb1 = new Label();


        btn1 = new Button("Push");
        btn1.setBounds(370,150,80,25);

        btn2 = new Button("Pop");
        btn2.setBounds(370,200,80,25);

        btn3 = new Button("clear");
        btn3.setBounds(370,250,80,25);

        ta1 = new TextArea(10,4);
        ta1.setBounds(100,120,200,80);

        lb1.setBounds(370,270,100,25);

        tf2 = new TextField();
        tf2.setBounds(370,290,80,25);

        //ta1.setEditable(false);
        add(tf1);
        add(btn1);
        add(ta1);
        add(btn2);
        add(btn3);
        add(lb1);
        add(tf2);
        
       
        btn1.addActionListener(new Push());
        btn2.addActionListener(new Pop());
        btn3.addActionListener(new Inner3());
        
        
       }
        
        class Push implements ActionListener
         {      
               public void actionPerformed(ActionEvent ae)
               {   
                                     
                   
                        String s = tf1.getText();
                        String sta = ta1.getText();

                        values[j] = s;
                        ta1.setText(""+values[j]+"\n"+sta);
                        j = j +1;
                        tf1.setText(null);
                       
                      
                        if (j==10) {

                         lb1.setText("overflow");                             
                            
                         } 

               }                                   
                    
        }
           
           class Pop implements ActionListener
         {             
               public void actionPerformed(ActionEvent ae)
               {   
                     
                     String sta = "";
                     j--;
                     tf2.setText(values[j]);
                     for(int i = 0; i<j;i++)
                     {
                        ta1.setText(values[i]+ "\n" + sta);
                        sta = ta1.getText();

                        if(i==10)
                        {
                           lb1.setText("UnderFlow");
                        }
                     }

               }
           }
        class Inner3 implements ActionListener
         {             
               public void actionPerformed(ActionEvent ae)
               {                      
                                                  
               }
           }

  public static void main(String[] args) {
  QueueDemo fr = new QueueDemo();
  fr.setVisible(true);
  fr.setSize(600,400);
  fr.setTitle("DemonStraing Stack");
  } 
    
}