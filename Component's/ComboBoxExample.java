import java.awt.FlowLayout;  
import javax.swing.JFrame;  
import javax.swing.JScrollPane;   
import javax.swing.*;    
public class ComboBoxExample 
	{    
		JFrame f;    
		private static final long serialVersionUID = 1L;  
		ComboBoxExample()
		{    
  			  f=new JFrame("ComboBox Example");    
 			   String lang[]={"Marathi","Sanskrit","English","Hindi"};        
 			   JComboBox cb=new JComboBox(lang);    
 			   cb.setBounds(50, 50,90,20);    
 			   f.add(cb);        
 			   f.setLayout(null);    
  			  f.setSize(400,500);    
  			  f.setVisible(true);        
			 
		}    
		

 public static void main(String[] args) 
	{    
	    new ComboBoxExample();             
		 {  

      		  String st = "Marathi\n" +  "English\n"  +  "Hindi\n" + "Sanskrit\n" ;
           
     		   JFrame frame = new JFrame("Example a JScrollPane ");  
      		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
      		  JPanel panel = new JPanel();  
       		 JTextArea area = new JTextArea(st, 3, 4);  
       		 JScrollPane spane = new JScrollPane(area);  
       		 panel.add(spane);  
        		 frame.add(panel);  
        		frame.setSize(400, 400);  
       		frame.setVisible(true);  
 	   }
          }  
}