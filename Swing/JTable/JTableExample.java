
import javax.swing.*;

public class JTableExample  
{
	JFrame f;
	JTableExample()
	{
		f = new JFrame();
		String data[][] = {{"01","AJP","Program_Files"},
							{"02","ST","Testing_templates"},
							{"03","ADBMS","Database"}};
		String colomn[] = {"ID","FOLDER_NAME","CONTENT"};
		JTable jt = new JTable(data,colomn);
		jt.setBounds(10,60,200,300);
		JScrollPane sp = new JScrollPane(jt);
		f.add(sp);
		f.setSize(300,400);
		f.setVisible(true);
	}
	public static void main(String[] args)
	{
		new JTableExample();
	}
} 