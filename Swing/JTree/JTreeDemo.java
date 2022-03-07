import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class JTreeDemo extends JFrame 
{
	JTree tree;
	DefaultMutableTreeNode root, parent1,parent2,parent3, child,child1,child2,child3,child4,child5,child6;
	JTreeDemo()
	{
		super("JTree Demo");


		root = new DefaultMutableTreeNode("States");
		parent1 = new DefaultMutableTreeNode("Maharashtra");
		child = new DefaultMutableTreeNode("Mumbai");
		child1 = new DefaultMutableTreeNode("Pune");
		child2 = new DefaultMutableTreeNode("Aurangabad");
		parent2 = new DefaultMutableTreeNode("Rajastan");
		child3 = new DefaultMutableTreeNode("Jaipur");
		child4 = new DefaultMutableTreeNode("Jodhput");
		child5 = new DefaultMutableTreeNode("Rajkot");
		parent3 = new DefaultMutableTreeNode("Chennei");
		child6 = new DefaultMutableTreeNode("Chennei");

		//Adding child nodes to parents 

		parent1.add(child);
		parent1.add(child1);
		parent1.add(child2);
		parent2.add(child3);
		parent2.add(child4);
		parent2.add(child5);
		parent3.add(child6);

		//Adding parent to JTree

		root.add(parent1);
		root.add(parent2);
		root.add(parent3);

		//Adding root to JTree

		tree = new JTree(root);

		getContentPane().add(new JScrollPane(tree));
		setSize(500,500);
		setVisible(true);

	}
	//class MyTreeDemo
	
			public static void main(String args[]) throws Exception {
				//UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
				new JTreeDemo();
			}
		
}