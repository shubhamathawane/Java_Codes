import java.awt.*;
import java.awt.event.*;


class MyDialog extends Dialog implements ActionListener
{   Button btn1;
    public MyDialog(Frame prnt,String title,boolean m)
    {
        super(prnt,title,m); // Sending 3 parameters to par. contr. of 'Dialog'
        this.setLayout(new FlowLayout() );
        this.setFont(new Font("TimesRoman", Font.PLAIN, 18));

        Label l1 = new Label("Login Successful");
        add(l1);
        btn1 = new Button("Ok");
        add(btn1);

        btn1.addActionListener(this);

       
    }
    public void actionPerformed(ActionEvent ae)
    {
        this.setVisible(false);
    }
}

class MyDialog2 extends Dialog implements ActionListener
{   Button btn1;
    public MyDialog2(Frame prnt,String title,boolean m)
    {
        super(prnt,title,m); // Sending 3 parameters to par. contr. of 'Dialog'
        this.setLayout(new FlowLayout() );
        this.setFont(new Font("TimesRoman", Font.PLAIN, 18));

        Label l2 = new Label("Login Failed, Try again");
        add(l2);    
        
        btn1 = new Button("OK");
        add(btn1);

        btn1.addActionListener(this);


    }
    public void actionPerformed(ActionEvent ae)
    {
        this.setVisible(false);
    }
}






 class LoginIdEvent extends Frame implements ActionListener
{
    Button btn1,btn2;
    Label lb1;
    TextField tf1,tf2 ;
    public LoginIdEvent()
    {
        // FlowLayout f =new FlowLayout();
        // this.setLayout(f);

        Font tr = new Font("TimesRoman", Font.PLAIN, 18);
        this.setFont(tr);

        setLayout(null);
        tf1 = new TextField ();
        tf1.setBounds(100,100,170,35);
        tf2 = new TextField ();
        tf2.setBounds(100,150,170,35);
        btn1 = new Button("Sign-In");
        btn1.setBounds(100,200,80,25); 
        btn2 = new Button("Sign-up");
        btn2.setBounds(190,200,80,25);

        
        tf2.setEchoChar('*');
           
        lb1 = new Label("_");
        lb1.setBounds(120,270,150,40);
        lb1.setBackground(new Color(0, 62, 83));
        lb1.setForeground(Color.white);

        
        add(tf1);
        add(tf2);    
        add(btn1);
        add(btn2);
        add(lb1);
        
        btn1.addActionListener(this);

      
        
       }
       public void actionPerformed(ActionEvent ap)
       {
           

            MyDialog d = new MyDialog(this,"Login",true);
            d.setSize(250,100);
            MyDialog2 d2 = new MyDialog2(this,"Login",true);
            d2.setSize(250,100);
            





           String username = tf1.getText();
           String password = tf2.getText();
           if(username.equals("admin") && password.equals("root"))
           {
            lb1.setText("Login Successful");
            d.setVisible(true);
           }
           else
           {
            lb1.setText("failed to Login");
            d2.setVisible(true);
           }
       }
       
     

  public static void main(String[] args) {
  LoginIdEvent fr = new LoginIdEvent();
  fr.setVisible(true);
  fr.setSize(400,400);
  fr.setTitle("Login using Event");
  fr.setBackground(new Color(0, 62, 83));
  } 
    
}